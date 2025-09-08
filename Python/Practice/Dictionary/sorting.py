# here we have to sort the dictionary by its values
my_dict={"apple": 10, "banana": 5, "mango": 7, "orange": 2}
sorted_dict=dict(sorted(my_dict.items(),key=lambda item:item[1],reverse=True))
print(sorted_dict);

print("Printing keys :-> ")
for k,v in my_dict.items():
    print(k)