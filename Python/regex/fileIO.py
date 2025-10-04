import pandas as pd

# # Your vehicle data
# vehicle_data = [ 
#     {"vehicle_id": "V001", "type": "Sedan", "manufacturer": "Toyota", "year": 2020, "mileage": 50000, "is_active": True}, 
#     {"vehicle_id": "V002", "type": "SUV", "manufacturer": "Honda", "year": 2022, "mileage": 25000, "is_active": True}, 
#     {"vehicle_id": "V003", "type": "Truck", "manufacturer": "Ford", "year": 2018, "mileage": 80000, "is_active": False}, 
#     {"vehicle_id": "V004", "type": "Sedan", "manufacturer": "Toyota", "year": 2021, "mileage": 30000, "is_active": True}, 
#     {"vehicle_id": "V005", "type": "SUV", "manufacturer": "Jeep", "year": 2023, "mileage": 10000, "is_active": True}, 
# ]

# # Convert dictionary to DataFrame
# df = pd.DataFrame(vehicle_data)

# # Save to JSON file
# df.to_json("vehicle.json", orient="records", indent=4)

# print("Data saved to vehicle.json")


class Vehicle:
    def __init__(self,vehicle_id,vehicle_type,vehicle_manufacturer,vehicle_year,vehicle_mileage,vehicle_isActive):
        self.vehicle_id=vehicle_id
        self.vehicle_type=vehicle_type
        self.vehicle_manufacturer=vehicle_manufacturer
        self.vehicle_year=vehicle_year
        self.vehicle_mileage=vehicle_mileage
        self.vehicle_isActive=vehicle_isActive
    
    def __repr__(self):
        return f"{self.__dict__}"


loaded_data=pd.read_json(r"F:\KPIT\Python\regex\vehicle.json")
print(f"Loaded data is {loaded_data}")
vehicles = [
    Vehicle(
        row["vehicle_id"],
        row["type"],
        row["manufacturer"],
        row["year"],
        row["mileage"],
        row["is_active"]
    )
    for _, row in loaded_data.iterrows()
]

# Print all vehicles
for v in vehicles:
    print(v)

    
# print(loaded_data)
