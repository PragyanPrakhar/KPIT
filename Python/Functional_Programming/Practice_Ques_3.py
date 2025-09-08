employees = [
    {"name": "Amit", "department": "IT", "salary": 70000, "experience": 3},
    {"name": "Neha", "department": "HR", "salary": 50000, "experience": 2},
    {"name": "Raj", "department": "Finance", "salary": 60000, "experience": 4},
    {"name": "Sneha", "department": "IT", "salary": 80000, "experience": 5},
    {"name": "Karan", "department": "Finance", "salary": 55000, "experience": 1}
]
# Find the highest-paid employee in each department, and return the result as a dictionary where:
# Key = Department
# Value = (Employee Name, Salary)
#Sample Output :->  
# {
#     "IT": ("Sneha", 80000),
#     "HR": ("Neha", 50000),
#     "Finance": ("Raj", 60000)
# }
def finding_highest_paid_employee(employees:list[dict])->dict:
    max_salary_dict={}
    final_dict={}
    for employee in employees:
        max_salary_dict.setdefault(employee["department"],[]).append(employee["salary"])
    
    print(max_salary_dict)
    for dept , salary in  max_salary_dict.items():
        final_dict.setdefault(dept,max(salary))
    print(final_dict)
    ans={}
    emp_name=[]
    for k,v in final_dict.items():
        emp_name.append(list(filter(lambda x:x["department"]==k and x["salary"]==v , employees)))
    print(f"Employees name are {emp_name}")
    
    for emp in emp_name:
        ans.setdefault(emp[0]["department"],tuple((emp[0]["name"],emp[0]["salary"])))
    
    print(f"Final ans is {ans}")
        
    
finding_highest_paid_employee(employees)
    
    
    