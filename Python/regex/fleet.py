from enum import Enum
import re
class EngineType(Enum):
    PETROL=1
    DIESEL=2
    ELECTRIC=3
    
class Vehicle:
    def __init__(self, vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year, vehicle_mileage, vehicle_isActive,vehicle_engine):
        self.vehicle_id = vehicle_id
        self.vehicle_type = vehicle_type
        self.vehicle_manufacturer = vehicle_manufacturer
        self.vehicle_year = vehicle_year
        self.vehicle_mileage = vehicle_mileage
        self.vehicle_isActive = vehicle_isActive
        self.vehicle_engine=vehicle_engine

    def __repr__(self):
        return f"{self.__dict__}"
    
    @property
    def vehicleYear(self):
        return self.vehicle_year
    
    @vehicleYear.setter
    def vehicleYear(self , value):
        if len(str(value))<4 or value<1900:
            print("Please enter a valid value for the year")
        else:
            self.vehicle_year=value
    
    @property
    def vehicleMileage(self):
        return self.vehicle_mileage
    
    @vehicleMileage.setter
    def vehicleMileage(self,value):
        if value<=0:
            print("Mileage can not be 0 or negative")
        else:
            self.vehicle_mileage=value
        
    @property
    def isActive(self):
        return self.vehicle_isActive
    
    @isActive.setter
    def isActive(self,value):
        if type(value)!=bool:
            print("is_active status of the vehicle can be boolean only")
        else:
            self.vehicle_isActive=value
            
class Engine:
    def __init__(self,engine_type,engine_hp):
        self.engine_type=engine_type
        self.engine_hp=engine_hp
    
    def __repr__(self):
        return f"{self.__dict__}"
        
        
        
class ElectricVehicle(Vehicle):
    def __init__(self,vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year, vehicle_mileage, vehicle_isActive,vehicle_battery_capacity,vehicle_charging_time,vehicle_engine):
        super().__init__(vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year, vehicle_mileage, vehicle_isActive,vehicle_engine)
        self.vehicle_battery_capacity=vehicle_battery_capacity
        self.vehicle_charging_time=vehicle_charging_time
    
    def __repr__(self):
        return f"{self.__dict__}"
    

def main() -> None:
    try:
        with open(r"F:\KPIT\Python\regex\fleet.txt", "r") as f1:
            contents = f1.readlines()  # read all lines

        vehicles = []

        # Regex patterns
        vehicle_id_pattern = re.compile(r"EV?\d{3}")  # V001 or EV001
        vehicle_type_pattern = re.compile(r"Sedan|SUV|Hatchback|Truck", re.IGNORECASE)
        vehicle_manufacturer_pattern = re.compile(r"Toyota|Honda|Tesla|Ford", re.IGNORECASE)
        vehicle_year_pattern = re.compile(r"\b(19\d{2}|20\d{2})\b")
        vehicle_mileage_pattern = re.compile(r"\b\d{4,5}\b")
        is_active_pattern = re.compile(r"\b(True|False)\b", re.IGNORECASE)
        engine_pattern = re.compile(r"Engine:(\w+),(\d+)")
        battery_pattern = re.compile(r"Battery:(\d+)")
        charging_pattern = re.compile(r"Charging:(\d+(\.\d+)?)")

        for line in contents:
            try:
                # Extract common vehicle info
                vehicle_id = vehicle_id_pattern.search(line).group()
                vehicle_type = vehicle_type_pattern.search(line).group()
                vehicle_manufacturer = vehicle_manufacturer_pattern.search(line).group()
                vehicle_year = int(vehicle_year_pattern.search(line).group())
                vehicle_mileage = int(vehicle_mileage_pattern.search(line).group())
                vehicle_isActive = True if is_active_pattern.search(line).group() == "True" else False

                # Extract engine info
                engine_match = engine_pattern.search(line)
                if engine_match:
                    engine_type_str, engine_hp = engine_match.groups()
                    engine_type_enum = EngineType[engine_type_str.upper()]
                    vehicle_engine = Engine(engine_type_enum, int(engine_hp))
                else:
                    vehicle_engine = None

                # Check if ElectricVehicle
                if vehicle_id.startswith("EV"):
                    battery_capacity = float(battery_pattern.search(line).group(1))
                    charging_time = float(charging_pattern.search(line).group(1))
                    v = ElectricVehicle(vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year,
                                        vehicle_mileage, vehicle_isActive, battery_capacity,
                                        charging_time, vehicle_engine)
                else:
                    v = Vehicle(vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year,
                                vehicle_mileage, vehicle_isActive, vehicle_engine)

                vehicles.append(v)

            except Exception as e_line:
                print(f"Skipping line due to error: {line.strip()}")
                print("Error:", e_line)

        # Print all vehicles
        for v in vehicles:
            print(v)

    except Exception as e:
        print("Error opening or reading file:", e)


if __name__ == "__main__":
    main()  
    