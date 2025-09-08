orders = [
    {"id": 1, "customer": "Alice", "items": ["Laptop", "Mouse"], "amount": 80000, "status": "Delivered"},
    {"id": 2, "customer": "Bob", "items": ["Smartphone"], "amount": 40000, "status": "Pending"},
    {"id": 3, "customer": "Alice", "items": ["Shoes", "T-shirt"], "amount": 6500, "status": "Delivered"},
    {"id": 4, "customer": "David", "items": ["Table"], "amount": 18000, "status": "Cancelled"},
    {"id": 5, "customer": "Eve", "items": ["Desk Chair", "Lamp"], "amount": 15000, "status": "Delivered"},
    {"id": 6, "customer": "Bob", "items": ["Headphones", "Keyboard"], "amount": 12000, "status": "Delivered"},
]
from functools import reduce

# 1. Using reduce + lambda

# Find the total spending per customer and return it as a dictionary:

# # Expected:
# {"Alice": 86500, "Bob": 52000, "David": 18000, "Eve": 15000}
def group_according_to_name(orders:list[dict])->dict:
    s=set([e["customer"] for e in orders ])
    final_dict={}
    for ele in s:
        list(map(lambda x:x,final_dict.setdefault(ele,reduce(lambda x,y:x+y,list(map(lambda x:x["amount"],list(filter(lambda x:x["customer"]==ele , orders))))))))  
    return final_dict
    
    
def atleast_one_delievered(orders:list[dict])->dict:
    pass
    

print(group_according_to_name(orders))