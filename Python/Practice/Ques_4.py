#Basics OOPS
class Student:
    marks=[];
    name="";
    def __init__(self,marks,name):
        self.name=name;
        self.marks=marks;
    
    def average(self):
        length=len(marks);
        totalSum=sum([num for num in marks])
        return totalSum/length;
    
print("Enter the name of the students");
name=input();
print("Enter the marks of the students");
marks=list(map(int,input().split()));
s=Student(marks,name);
print(s.average());
        