# 1. Employee Dataset

# You are given a list of employees, each with name, department, salary, and years of experience.
from functools import reduce
employees = [
    {"name": "Alice", "department": "IT", "salary": 70000, "experience": 5},
    {"name": "Bob", "department": "HR", "salary": 50000, "experience": 3},
    {"name": "Charlie", "department": "IT", "salary": 90000, "experience": 7},
    {"name": "David", "department": "Finance", "salary": 60000, "experience": 4},
    {"name": "Eve", "department": "Finance", "salary": 95000, "experience": 8},
]


# Implement the following functions:

# get_highest_paid(employees) → returns the employee with the highest salary.

# get_average_salary(employees) → returns the average salary of all employees.

# get_employees_by_department(employees, dept) → returns list of employees in a given department.

# get_top_experienced(employees, n) → returns top n employees with most years of experience.

# get_department_salary_avg(employees) → returns a dict {dept: avg_salary} for each department.


def get_highest_paid(employees:list[dict])->dict:
    # return max(list(map(lambda x : x["salary"] , employees)))
    return sorted(employees,key= lambda x:x["salary"],reverse=True)[0]

def get_average_salary(employees:list[dict])->int:
    return reduce(lambda x , y : x+y, list(map(lambda x:x["salary"],employees)))/len(employees)

def get_employees_by_department(employees:list[dict],dept:str)->list[dict]:
    return list(filter(lambda x : x["department"]==dept,employees))

def get_top_experienced(employees:list[dict],n:int)->list[dict]:
    return list(filter(lambda x:x["experience"]==n , employees))


def get_department_salary_avg(employees: list[dict]) -> dict:
    dept_salary = {}
    for e in employees:
        dept_salary.setdefault(e["department"], []).append(e["salary"])
    return {dept: sum(salaries)/len(salaries) for dept, salaries in dept_salary.items()}

print(get_highest_paid(employees))
print(get_average_salary(employees))
print(get_employees_by_department(employees,"IT"))
print(get_top_experienced(employees,7))
print(get_department_salary_avg(employees))
# print(get_department_salary_avg(employees))
