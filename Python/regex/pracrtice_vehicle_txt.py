# import re
# class Vehicle:
#     def __init__(self,vehicle_id,vehicle_type,vehicle_manufacturer,vehicle_year,vehicle_mileage,vehicle_isActive):
#         self.vehicle_id=vehicle_id
#         self.vehicle_type=vehicle_type
#         self.vehicle_manufacturer=vehicle_manufacturer
#         self.vehicle_year=vehicle_year
#         self.vehicle_mileage=vehicle_mileage
#         self.vehicle_isActive=vehicle_isActive
    
#     def __repr__(self):
#         return f"{self.__dict__}"


# f=open(r"F:\KPIT\Python\regex\vehicles.txt","r")
# contents=f.readlines()
# str(contents)
# print(f.readlines())
# vehicle_id_pattern=re.compile(r"V\d{3}")
# vehicle_type_pattern=re.compile(r"V\d{3},\s[A-z]+[a-zA-z]\b")
# vehicle_manufacturer_pattern=re.compile(r"")
# for line in contents:
    
    
import re

class Vehicle:
    def __init__(self, vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year, vehicle_mileage, vehicle_isActive):
        self.vehicle_id = vehicle_id
        self.vehicle_type = vehicle_type
        self.vehicle_manufacturer = vehicle_manufacturer
        self.vehicle_year = vehicle_year
        self.vehicle_mileage = vehicle_mileage
        self.vehicle_isActive = vehicle_isActive

    def __repr__(self):
        return f"{self.__dict__}"

# Open and read the file
with open(r"F:\KPIT\Python\regex\vehicles.txt", "r") as f:
    contents = f.readlines()

vehicles = []

# Regex patterns
vehicle_id_pattern = re.compile(r"V\d{3}")
vehicle_type_pattern = re.compile(r"\b(Sedan|SUV|Truck)\b", re.IGNORECASE)
vehicle_manufacturer_pattern = re.compile(r"\b(Toyota|Honda|Ford|Jeep)\b", re.IGNORECASE)
vehicle_year_pattern = re.compile(r"\b(20\d{2})\b")
vehicle_mileage_pattern = re.compile(r"\b\d{4,5}\b")
vehicle_isActive_pattern = re.compile(r"\b(True|False)\b", re.IGNORECASE)

# Process each line
for line in contents:
    vehicle_id = vehicle_id_pattern.search(line).group()
    vehicle_type = vehicle_type_pattern.search(line).group()
    vehicle_manufacturer = vehicle_manufacturer_pattern.search(line).group()
    vehicle_year = int(vehicle_year_pattern.search(line).group())
    vehicle_mileage = int(vehicle_mileage_pattern.search(line).group())
    vehicle_isActive = True if vehicle_isActive_pattern.search(line).group() == "True" else False

    # Create Vehicle object
    v = Vehicle(vehicle_id, vehicle_type, vehicle_manufacturer, vehicle_year, vehicle_mileage, vehicle_isActive)
    vehicles.append(v)

# Print all vehicles
for v in vehicles:
    print(v)
