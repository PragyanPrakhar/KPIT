# Got it 👍
# You want *practice questions* where the input is a *list of dictionaries, and the task is to perform **functional programming operations* (map, filter, reduce, lambda, sorted, comprehensions, etc.).

# Here’s a set of *10 good coding questions* for you:

# ---

# ### 📘 List of Dictionaries (common dataset to use)
from functools import reduce
# python
students = [
    {"name": "Anish", "age": 22, "marks": 85, "course": "AI"},
    {"name": "Ravi", "age": 20, "marks": 67, "course": "ML"},
    {"name": "Sneha", "age": 21, "marks": 92, "course": "AI"},
    {"name": "Kiran", "age": 23, "marks": 75, "course": "DS"},
    {"name": "Meera", "age": 22, "marks": 59, "course": "ML"}
]


# ---

# ### 🔹 Questions

# 1. **Using map + lambda**:
#    Extract only the names of students from the list.

# 2. **Using filter + lambda**:
#    Get the students who scored *more than 70 marks*.

# 3. **Using reduce**:
#    Find the *total marks* of all students.

# 4. **Using map + lambda**:
#    Increase each student’s marks by *5 bonus points* (return updated list).

# 5. **Using sorted + lambda**:
#    Sort the students based on their marks in *descending order*.

# 6. **Using filter + map**:
#    Get the names of students who are enrolled in the *"AI" course*.

# 7. *Using dictionary comprehension*:
#    Create a dictionary with *student name as key* and *marks as value*.

# 8. **Using reduce + lambda**:
#    Find the student with the *highest marks*.

# 9. **Using filter**:
#    Get the list of students whose *age is less than 22*.

# 10. **Using map + lambda**:
#     Create a new list with strings in the format:
#     "Name: Anish, Course: AI, Marks: 85"

# ---

# 👉 Do you want me to also provide *answers (code snippets)* for each of these questions, or just keep them as practice exercises?
def take_input():
    strength=int(input("Enter the number of students"))
    students_data=[{"name":input("Enter the name of the student"),"age":int(input("Enter the age of the student")),"marks":int(input("Enter the marks of the students")),"course":input("Enter the course in which the student is enrolled")} for i in range (strength)]
    return students_data
def extracting_only_names(students:list[dict])->list[str]:
    return list(map(lambda x:x["name"],students))

def students_scored_more_than_70(students:list[dict])->list[dict]:
    return list(filter(lambda x:x["marks"]>70 , students))

def total_marks_of_all_students(students:list[dict])->int:
    return reduce(lambda x,y:x+y,list(map(lambda x:x["marks"],students)))

def increase_marks(student:dict):
    student["marks"]=student["marks"]+5
    return student
    
def increase_each_student_marks_by_5_bonus_point(students:list[dict])->list[dict]:
    return list(map(lambda x : increase_marks(x),students))

def students_enrolled_in_AI_marks(students:list[dict])->list[dict]:
    return list(filter(lambda x:x["course"]=="AI",students))

def sorting_students(students:list[dict])->list[dict]:
    return sorted(students,key=lambda x:x["marks"],reverse=True)

# def creating_dict_with_name_and_marks(students:list[dict])->list[dict]:
#     new_student_dict={}
#     # map(lambda x:new_student_dict.update(x["name"],x["marks"]),students)
#     for name,marks in zip(students)
#     return new_student_dict

def find_student_with_highest_marks(students:list[dict])->dict:
    return max(students,key=lambda x:x["marks"])

def finding_students_with_age_less_than_22(students:list[dict])->list[dict]:
    return list(filter(lambda x:x["age"]<22,students))
    

def main()->None:
    students=take_input()
    print(extracting_only_names(students))
    print(students_scored_more_than_70(students))
    print(total_marks_of_all_students(students))
    print(increase_each_student_marks_by_5_bonus_point(students))
    print(students_enrolled_in_AI_marks(students))
    print(sorting_students(students))
    print(find_student_with_highest_marks(students))
    print(finding_students_with_age_less_than_22(students))
    # print(creating_dict_with_name_and_marks(students))
    print(f"in the string format {str(students).replace('{','').replace('}','').replace('[','').replace(']','')}")
    
if __name__=="__main__":
    main()
