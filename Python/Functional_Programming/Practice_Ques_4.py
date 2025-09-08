products = [
    {"id": 1, "name": "Laptop", "category": "Electronics", "price": 75000, "stock": 5},
    {"id": 2, "name": "Smartphone", "category": "Electronics", "price": 40000, "stock": 10},
    {"id": 3, "name": "Desk Chair", "category": "Furniture", "price": 12000, "stock": 7},
    {"id": 4, "name": "Table", "category": "Furniture", "price": 18000, "stock": 3},
    {"id": 5, "name": "Shoes", "category": "Fashion", "price": 5000, "stock": 15},
    {"id": 6, "name": "T-shirt", "category": "Fashion", "price": 1500, "stock": 25}
]
# Using map + lambda
# Extract only the product names from the list.

# Using filter + lambda
# Get all products with a price greater than ₹20,000.

# Using reduce
# Find the total stock of all products combined.

# Using map + lambda
# Apply a 10% discount on each product’s price and return a new updated list.

# Using sorted + lambda
# Sort the products by stock quantity in ascending order.

# Using filter + map
# Get the names of products in the "Furniture" category.

# Using dictionary comprehension
# Create a dictionary where the key = product name and value = price.

# Using reduce + lambda
# Find the product with the highest stock quantity.

# Using filter
# Get the products whose stock is less than 5 (low-stock items).

# Using map + lambda
# Create a new list of strings in the format:
# "Product: Laptop, Category: Electronics, Price: 75000, Stock: 5"

# Using groupby (from itertools)
# Group all products by category and list product names under each category.

# Using filter + reduce
# Find the most expensive product in the "Fashion" category.
from functools import reduce
def extracting_names_only(products:list[dict])->list[str]:
    return [prod.get("name") for prod in products]

# 1. Get all products with a price greater than ₹20,000.
def get_all_products_with_price_greater_than_20k(products:list[dict])->list[dict]:
    return list(filter(lambda x:x["price"]>20000 , products))

# 2. Find the total stock of all products combined.
def find_total_stock(products:list[dict])->int:
    return reduce(lambda x,y:x+y,list(map(lambda x:x["stock"],products)),0);

# 3. applying discount on each item
def apply_discount_on_each_item(prod:dict)->dict:
    new_price=prod["price"]*0.9
    prod["price"]=new_price
    return prod

# 4. Apply a 10% discount on each product’s price and return a new updated list.
def apply_discount(products:list[dict])->dict:
    return list(map(lambda x:apply_discount_on_each_item(x) , products))
    
# 5. sorting according to the ascending order according to the stock quantity
def sort_stock(products:list[dict])->list[dict]:
    return sorted(products,key=lambda x:x["stock"],reverse=True)

# 6. Get the names of products in the "Furniture" category.
def get_names_of_prod_furniture(products:list[dict])->list[str]:
    return list(map(lambda x:x["name"],list(filter(lambda x:x["category"]=="Furniture",products))))

# Using dictionary comprehension
# 7. Create a dictionary where the key = product name and value = price.
def creating_dict_with_prodName_and_price(proucts:list[dict])->dict:
    return {s["name"]:s["price"] for s in products}

# 8. Find the product with the highest stock quantity.
def find_product_with_highest_quantity(products:list[dict])->list[dict]:
    return max(products,key=lambda x:x["stock"])
    # print(f"max price is {max_price}")

#Using filter
# 9. Get the products whose stock is less than 5 (low-stock items).
def product_with_stock_less_than_5(products:list[dict])->list[dict]:
    return list(filter(lambda x:x["stock"]<5 , products))

# Using filter + reduce
# Find the most expensive product in the "Fashion" category.

def most_expensive_prod_in_fashion_industry(products:list[dict])->list[dict]:
    return max(filter(lambda x:x["category"]=="Fashion",products),key=lambda x :x["price"])
    
    
    

    
print(extracting_names_only(products))
print(get_all_products_with_price_greater_than_20k(products))
print(find_total_stock(products))
print(apply_discount(products))
print(f"Sorted according to the stock{sort_stock(products)}")
print()
print(f"names of products of furniture category {get_names_of_prod_furniture(products)}")
print()
print(f"creating products with name and price {creating_dict_with_prodName_and_price(products)}")
print()
print(f"Max price of the product is {find_product_with_highest_quantity(products)}")
print()
print(f"products with stock less than 5 are {product_with_stock_less_than_5(products)}")
print()
print(f"Most expensive product in the fashion industry is {most_expensive_prod_in_fashion_industry(products)}")