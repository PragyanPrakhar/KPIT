class Employee:
    def __init__(self, emp_id: str, name: str):
        self.emp_id = emp_id
        self.name = name
    
    def apply_leave(self, days: int):
        print(f"Employee {self.name} requested {days} days of leave. Approval pending.")


class Manager(Employee):
    def __init__(self, emp_id: str, name: str):
        super().__init__(emp_id, name)
    
    def apply_leave(self, days: int):
        print(f"Manager {self.name} must get approval from the Department Head for {days} days leave.")


class Director(Employee):
    def __init__(self, emp_id: str, name: str):
        super().__init__(emp_id, name)
    
    def apply_leave(self, days: int):
        print(f"Director {self.name} must get approval from the CEO for {days} days leave.")


class Intern(Employee):
    def __init__(self, emp_id: str, name: str):
        super().__init__(emp_id, name)
    
    def apply_leave(self, days: int):
        if days > 5:
            print(f"Leave request denied for Intern {self.name}. Requested: {days} days")
        else:
            print(f"Intern {self.name} leave approved for {days} days (max allowed = 5).")


class DepartmentHead(Manager, Director):
    pass


def main() -> None:
    e1 = Employee("E101", "Pragyan")
    m1 = Manager("M201", "Rahul")
    d1 = Director("D301", "Asha")
    i1 = Intern("I401", "Karan")
    dh1 = DepartmentHead("DH501", "Suman")

    e1.apply_leave(7)
    m1.apply_leave(10)
    d1.apply_leave(15)
    i1.apply_leave(6)
    dh1.apply_leave(12)


if __name__ == "__main__":
    main()
