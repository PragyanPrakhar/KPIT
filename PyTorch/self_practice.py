# All the imports
import torch
import torch.nn as nn
from torch.utils.data import DataLoader,Dataset,random_split
import torch.optim as optim
import numpy as np
import pandas as pd
import plotly.express as px
from functools import wraps
from sklearn.preprocessing import StandardScaler
import time

# Setting random seed for reproducability
torch.manual_seed(42)
np.random_seed(42)

# Timing Decorator -> STEP : 01

def time_epoch(func:callable):
    @wraps(func)
    def wrapper(*args,**kwargs):
        start_time=time.time
        res=func(*args,**kwargs)
        end_time=time.time
        print(f"The function {func.__name__} took {end_time-start_time} seconds")
        
        return res
    return wrapper

# Data Exploration  -> STEP : 02

def explore_data(df:pd.DataFrame):
    print("Dataset Info:")
    print(df.info())
    print("\nSummary Statistics:")
    print(df.describe())
    print("\nCorrelation with Insurance Price:")
    print(df.corr()['insurance_price'].sort_values(ascending=False))
    # Visualize correlation with market price
    fig=px.scatter(df['market_price'], df['insurance_price'])
    print(fig)


# 3 : Function for selecting the features
def select_feature(x,y,feature_names,threshold=0.4):
    corr_matrix=np.corrcoef(x.T,y.T)[:-1,-1]
    print(corr_matrix, type(corr_matrix), corr_matrix.shape)
    
    selected_features=np.abs(corr_matrix) > threshold
    
    selected_names=feature_names[selected_features]
    
    print(f"Selected features are :{selected_features}")
    return x[:,selected_features] , selected_names

# 4 : Custom Dataset Class
def VehicleInsuaranceClass(Dataset):
    def __init__(self,x,y):
        self.x=torch.tensor(x,dtype=torch.float32)
        self.y=torch.tensor(y,dtype=torch.float32).reshape(-1,1)
        
    def __len__(self):
        return len(self.x)
    
    def __getitem__(self,idx):
        return self.x[idx] , self.y[idx]
    

# 5 : Data preprocessing function
def preprocess_data(df,target_col='insuarance_price'):
    x=df.drop(columns=[target_col]).values
    y=df[target_col].values
    scaler=StandardScaler()
    x_scaled=scaler.fit_transform(x)
    return x_scaled , y , scaler

# 6 : Data splitting function
def split_data(dataset , train_ratio=0.7 , val_ratio=0.15):
    train_size=int(train_ratio * len(dataset))
    val_size=int(val_ratio * len(dataset))
    test_size=len(dataset) - train_size - val_size
    train_dataset,val_dataset,test_dataset=random_split(dataset,[train_size,val_size,test_size])
    return train_dataset,val_dataset,test_dataset

# 7. Data Loader Function
def create_data_loaders(train_dataset, val_dataset, test_dataset, batch_size=32):
  train_loader = DataLoader(train_dataset, batch_size=batch_size, shuffle=True)
  val_loader = DataLoader(val_dataset, batch_size=batch_size)
  test_loader = DataLoader(test_dataset, batch_size=batch_size)
  return train_loader, val_loader, test_loader

# 8. Regression Model
class RegressionModel(nn.Module):
    def __init__(self,input_dim):
        super().__init__()
        self.layers=nn.Sequential(
            nn.Linear(
                input_dim , 1
            )
        )
        
    def forward(self , x):
        return self.layers(x)
    
