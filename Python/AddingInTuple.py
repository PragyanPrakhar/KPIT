def main():
    print("Finding the even numbers from 1 to 10 and adding it into the tuple")
    tup=()
    for i in range(1,11):
        if i%2 == 0:
            tup=tup+(i,)
        
    print(tup)

if __name__=="__main__":
    main()