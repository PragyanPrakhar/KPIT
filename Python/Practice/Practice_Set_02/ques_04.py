# data={'s1': {'math':80,'eng':90},'s2': {'math':70}}
# sid='s3' record=
# {'eng':85,'sci':78}

def average_marks(data: dict[str, dict[str, float]]):
    final_rec={}
    # for k,v in data.items():
    return dict(map(lambda item: (item[0], sum(item[1].values()) / len(item[1]) if item[1] else 0),data.items()))
    # return dict(map(lambda k,v:final_rec.update({k:sum(v.keys() / len(v.items()))}),data.items()))
        # final_rec.update({k:sum(v.keys() / len(v.items()))})

# {'s1':('eng',90.0),'s2':('math',70.0)}
def max_grade_per_student(data: dict[str, dict[str, float]])-> dict[str, tuple[str, float]]:
    return dict(map(lambda item:(item[0],(max(item[1].items(),key=lambda z:z[1])))),data.items())

# {'math':75.0,'eng':90.0,'sci':78.0}
def subject_wise_average(data: dict[str, dict[str, float]])-> dict[str, float]:
    final_dict={}
    for k,v in data.items():
        for key,value in v.items():
            if key in final_dict:
                final_dict.update({key:(final_dict[key][0]+value , final_dict[key][1]+1)})
            else:
                final_dict.update({key:(value,1)})
                
    for key,value in final_dict.items():
        final_dict.update({key:(value[0]/value[1])})

    return final_dict

def flatten_nested(data: dict[str, dict[str, float]]) -> list[tuple[str, str, float]]:
    final_list=[]
    for k,v in data.items():
        for key,value in v.items():
            final_list.append((k,key,value))
        
    return final_list

def add_student_record(data: dict[str, dict[str, float]],sid: str, record: dict[str, float]) -> None:
    if sid in data:
        data[sid].update(record)
    else:
        data[sid]=record
        
            
    
def main():
    pass

if __name__=="__main__":
    main()