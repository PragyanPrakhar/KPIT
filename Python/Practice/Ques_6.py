class Student:
    name="";
    marks=0;
    def __init__(self,name,marks):
        self.name=name;
        self.marks=marks;
    
    def grade(self):
        if(self.marks >= 90):
            return "A";
        elif(self.marks >= 75):
            return "B";
        elif(self.marks>= 50):
            return "C";
        else:
            return "Fail";
        
student1=Student("Abcd",97);
print(student1.grade());
student2=Student("xcvcb",65);
print(student2.grade());
        