# # # Student Management System
# # Create a Student class with attributes: name, age, grade, and scores (dict of subjects).
# # Create a School class that holds a list of students.

# # Tasks (using FP concepts inside methods):

# # get_students_above_average() → return students with above overall average (use reduce).

# # get_top_scorers(n) → return top n students with highest average scores (use sorted).

# # get_students_by_grade(grade) → filter students by grade (use filter).

# # get_average_score_by_subject(subject) → compute avg score in a given subject (use map + reduce).

# # get_highest_scorer_in_subject(subject) → return student with highest subject score (use max).
# from functools import reduce

# def take_input():
#     strength=int(input("Enter the number of students in the school"))
    
#     students_data=[{"name":input("Enter the name of the student") , "grade":input("Enter the grade of the student") , "scores":{
#         "maths":int(input("Enter the score in the maths subject")),
#         "science":int(input("Enter the score in the science subject")),
#         "english":int(input("Enter the score in the english subject"))
#     }} for i in range(strength)]
    
#     return students_data

# class Student:
#     def __init__(self,name,grade,scores):
#         self.name=name
#         self.grade=grade
#         self.scores=scores
    
#     def __repr__(self):
#         return f"{self.__dict__}"

# class School:
#     def __init__(self,students):
#         self.students=students
        
#     def __repr__(self):
#         return f"{self.__dict__}"
    
#     def get_students_above_average(self)->list[Student]:
#         return list(filter(lambda z : z > reduce(lambda x,y:x+y,list(map(lambda q:self.finding_total_scores_each_student(q)/3,self.students)))/len(self.students),self.students)) 
    
#     def generate_new_mapping(student:dict)->dict:
#         student["scores"]=student["scores"]["maths"]+student["scores"]["science"]+student["scores"]["english"]
#         return student
    
#     def finding_total_scores_each_student(self:list[dict],new_students)->int:
#         return reduce(lambda q,w:q["scores"]+w["scores"],(list(map(lambda x:self.generate_new_mapping(x) , new_students))))
        
        
#     def get_top_scorers(self,n)->list[dict]:
#         students_mapped_to_scores={}
#         new_students=self.students
#         list(map(lambda x:x.update("scores",self.finding_total_scores_each_student(x))),new_students)
        
        
#         return sorted(new_students,key=lambda x:x["scores"],reverse=True)[:n]
    
#     def get_students_by_grade(self,grade:str)->list[dict]:
#         return list(filter(lambda x:x["grade"]==grade , self.students))
    
#     def get_average_score_by_subject(self,subject:str)->int:
#         return sum(list(map(lambda x : x["scores"][subject],self.students)))/len(self.students)
    
#     def get_highest_scorer_in_subject(self,subject:str)->list[dict]:
#         max_score_in_given_subject=max(self.students,key=lambda x:x["scores"][subject])
#         return list(filter(lambda x : x["scores"][subject]==max_score_in_given_subject),self.students)
        
    
    
    

# def main()->None:
#     students_data=take_input()
#     s=School(students_data)
#     print(f"students above average score are : {s.get_students_above_average()}")
#     print()
#     print(f"top scorers are :-> {s.get_top_scorers(2)}")
#     print()
#     print(f"Getting students by grade : {s.get_students_by_grade('A+')}")
#     print()
#     print(f"Getting Average score by each subject : {s.get_average_score_by_subject('maths')}")
#     print()
#     print(f"getting highest score in subject {s.get_highest_scorer_in_subject('maths')}")
    
    
    
    
# if __name__=="__main__":
#     main()
    
    
    
from functools import reduce

class Student:
    def __init__(self, name, grade, scores):
        self.name = name
        self.grade = grade
        self.scores = scores
    
    def average_score(self) -> float:
        return sum(self.scores.values()) / len(self.scores)
    
    def __repr__(self):
        return f"{self.name} (Grade: {self.grade}, Scores: {self.scores})"

class School:
    def __init__(self, students):
        self.students = students
    
    def get_students_above_average(self) -> list[Student]:
        overall_avg = reduce(lambda x, y: x + y, map(lambda s: s.average_score(), self.students)) / len(self.students)
        return list(filter(lambda s: s.average_score() > overall_avg, self.students))
    
    def get_top_scorers(self, n: int) -> list[Student]:
        return sorted(self.students, key=lambda s: s.average_score(), reverse=True)[:n]
    
    def get_students_by_grade(self, grade: str) -> list[Student]:
        return list(filter(lambda s: s.grade == grade, self.students))
    
    def get_average_score_by_subject(self, subject: str) -> float:
        total = reduce(lambda x, y: x + y, map(lambda s: s.scores[subject], self.students))
        return total / len(self.students)
    
    def get_highest_scorer_in_subject(self, subject: str) -> Student:
        return max(self.students, key=lambda s: s.scores[subject])

# -----------------------
# Example Usage
# -----------------------
def main():
    students = [
        Student("John", "9", {"maths": 90, "science": 80, "english": 95}),
        Student("Alice", "10", {"maths": 95, "science": 90, "english": 85}),
        Student("Bob", "9", {"maths": 80, "science": 85, "english": 90}),
        Student("Charlie", "11", {"maths": 90, "science": 95, "english": 80}),
        Student("David", "10", {"maths": 85, "science": 90, "english": 95}),
    ]
    
    school = School(students)
    
    print("\nStudents above average:")
    print(school.get_students_above_average())
    
    print("\nTop 3 scorers:")
    print(school.get_top_scorers(3))
    
    print("\nStudents in grade 10:")
    print(school.get_students_by_grade("10"))
    
    print("\nAverage score in maths:")
    print(school.get_average_score_by_subject("maths"))
    
    print("\nHighest scorer in science:")
    print(school.get_highest_scorer_in_subject("science"))

if __name__ == "__main__":
    main()
