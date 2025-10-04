import pandas as pd
import re
class Student:
    def __init__(self,student_id,student_name,student_age,student_major,student_subject,student_score):
        self.student_id=student_id
        self.student_name=student_name
        self.student_age=student_age
        self.student_major=student_major
        self.student_subject=student_subject
        self.student_score=student_score
        
    def __repr__(self):
        return f"{self.__dict__}"
    
    
def load_students_from_json(filePath):
    json_df=pd.read_json(filePath)
    return json_df

def load_scores_from_text(filePath):
    with open(filePath,"r") as f:
        student_id_pattern=re.compile(r"(?<=Student ID: )S\d{3}")
        student_subject_pattern=re.compile(r"(?<=Subject: )[a-zA-Z]+")
        student_score_pattern=re.compile(r"(?<=Score: )\d+")
        
        # TO convert the data into the list of dictionaries
        student_list=[]
        for line in f.readlines():
            student_id=re.search(student_id_pattern,line).group()
            student_subject=re.search(student_subject_pattern,line).group()
            student_score=re.search(student_score_pattern,line).group()
            
            student_list.append({"student_id":student_id,"student_subject":student_subject,"student_score":student_score})
            
        #Preprocessing the file to convert it into the dataframe
        
        final_dict_of_students={}
        final_dict_of_students.setdefault("student_id",list(map(lambda student:student["student_id"],student_list)))
        final_dict_of_students.setdefault("student_subject",list(map(lambda student:student["student_subject"],student_list)))
        final_dict_of_students.setdefault("student_score",list(map(lambda student:student["student_score"],student_list)))
        
        text_df=pd.DataFrame(final_dict_of_students)

        return text_df

def main()->None:
    jsonPath=r"F:\KPIT\Python\file-io\students.json"
    textPath=r"F:\KPIT\Python\file-io\student_scores.txt"
    json_df=load_students_from_json(jsonPath)
    text_df=load_scores_from_text(textPath)
    # print(f"Json is {json_df}")
    # print(f"Text is {text_df}")
    
    json_df=json_df.rename(columns={"id":"student_id","name":"student_name","age":"student_age","major":"student_major"})
    concatted_data=pd.merge(json_df,text_df)
    print(concatted_data)
    
    
    # json_df['student_subject']=text_df['student_subject']
    # json_df['student_score']=text_df['student_score']
    # print(json_df)
    # print(json_df)
    # final_student_list=[]
    
    # for idx,data in json_df.iterrows():
        # final_student_list.append(Student(data.student_id,data.student_name,data.student_age,data.student_major,data.student_subject,data.student_score))
        
    # for stdt in final_student_list:
        # print(stdt)
        
    
    # json_df.to_json("final_merged.json")
    
            
if __name__=="__main__":
    main()
        