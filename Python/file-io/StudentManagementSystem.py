import re
import pandas as pd

class Person:
    def __init__(self,person_name,person_year):
        self.person_name=person_name
        self.person_year=person_year
        
    def __repr__(self):
        return f"{self.__dict__}"
    

class Course:
    def __init__(self,course_id,course_name,course_credits):
        self.course_id=course_id
        self.course_name=course_name
        self.course_credits=course_credits
    
    def __repr__(self):
        return f"{self.__dict__}"

class Student(Person):
    def __init__(self,student_name,student_year,student_id):
        super().__init__(student_name,student_year)
        self.student_id=student_id
        self.student_courses_enrolled=[]
        self.gradebook={}
    
    def enroll_course(self,course):
        self.student_courses_enrolled.append(course)
    
    def add_grade(self,course_id,grade):
        self.gradebook[course_id]=grade
    
    def __repr__(self):
        return f"{self.__dict__}"
    
    @property
    def studentYear(self):
        return self.student_year
    
    @studentYear.setter
    def studentYear(self,value):
        if value < 2000:
            print("Year can not be less than 2000")
        else:
            self.student_year=value
    
def load_students_from_csv(filePath):
    


        
    
        

        