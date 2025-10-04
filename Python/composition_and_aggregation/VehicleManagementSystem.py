from enum import Enum
from functools import reduce

class InvalidYearError(Exception):
    def __init__(self,*args):
        super().__init__(*args)

class EngineType(Enum):
    PETROL=1
    DIESEL=2
    ELECTRIC=3

class Engine:
    def __init__(self,engine_type,horsepower):
        self.engine_type=engine_type
        self.horsepower=horsepower

class Vehicle:
    def __init__(self,vehicle_id,model,year,mileage,isActive,engine):
        if mileage < 0:
            raise ValueError(f"Inavlid Value")
        if year < 1990:
            raise InvalidYearError(f"Invalid Year")
        self.vehicle_model=model
        self.vehicle_id=vehicle_id
        self.vehicle_year=year
        self.vehicle_mileage=mileage
        self.vehicle_isActive=isActive
        self.vehicle_engine=engine
        
    def __repr__(self):
        return f"{self.__dict__}"
    
class Car(Vehicle):
    def __init__(self,car_id,car_model,car_year,car_mileage,car_isActive,car_engine,seating_capacity):
        super().__init__(car_id,car_model,car_year,car_mileage,car_isActive,car_engine)
        self.car_seating_capacity=seating_capacity
    
    def __repr__(self):
        return f"{self.__dict__}"


class Truck(Vehicle):
    def __init__(self,truck_id,truck_model,truck_year,truck_mileage,truck_isActive,truck_engine,truck_cargo_capacity):
        super().__init__(truck_id,truck_model,truck_year,truck_mileage,truck_isActive,truck_engine)
        self.truck_cargo_capacity=truck_cargo_capacity
    def __repr__(self):
        return f"{self.__dict__}"

def filter_active_vehicles(list_of_vehicles):
    return list(filter(lambda x:x.vehicle_isActive == True,list_of_vehicles))

def map_vehicle_models(list_of_vehicles):
    return list(map(lambda x:x.vehicle_model,list_of_vehicles))

def reduce_total_mileage(list_of_vehicles):
    return reduce(lambda p,c:p+c,list(map(lambda q:q.vehicle_mileage,list_of_vehicles)))

def group_vehicles_by_type(list_of_vehicles):
    list_of_models=list(map(lambda x:x.vehicle_model,list_of_vehicles))
    return {
        vehicle_model : list(filter(lambda x:x.vehicle_model==vehicle_model,list_of_vehicles)) for vehicle_model in list(map(lambda x:x.vehicle_model,list_of_vehicles))
        }
    
def main():
    engine1 = Engine("Petrol", 120)
    engine2 = Engine("Diesel", 200)

    car1 = Car("C001", "Honda City", 2018, 20000, True, engine1, 5)
    truck1 = Truck("T001", "Volvo FH", 2015, 80000, False, engine2, 12000)

    vehicles = [car1, truck1]

    print(filter_active_vehicles(vehicles))
    # Output: [car1]

    print(map_vehicle_models(vehicles))
    # Output: ["Honda City", "Volvo FH"]

    print(reduce_total_mileage(vehicles))
    # Output: 100000

    print(group_vehicles_by_type(vehicles))
    # Output: {"Car": ["Honda City"], "Truck": ["Volvo FH"]}

if __name__=="__main__":
    main()
    
    
    
    
        