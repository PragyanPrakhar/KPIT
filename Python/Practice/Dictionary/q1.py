def printingDict(dict):
    for k,v in dict.items():
        print(f"key is {k} and value is {v}")
def main():
    dict={}
    length=int(input("Enter the length of the dictionary"))
    for _ in range(length):
        key=input("Enter the key of the dict")
        value=input("Enter the value for the above key")
        dict[key]=value
        
    for key,value in dict.items():
        print(f" {key} : {value}")
        
    print("Now taking input as the key from the user")
    checkKey=input("Enter the key to be checked")
    foundKey=False
    for k,v in dict.items():
        if(k==checkKey):
            foundKey=True
            print(f"Found the key {checkKey}")
    
    if not foundKey:
        print(f"The required key {checkKey} is not found")
        
    if foundKey:
        print("Now taking the value for that found key")
        valueOfTheKey=input("Enter the value of the key")
        dict[checkKey]=valueOfTheKey
        
#we can use pop to delete the key from the dictionary only
    
    printingDict(dict)
        


if __name__=="__main__":
    main()
    
