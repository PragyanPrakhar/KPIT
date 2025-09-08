# taking input from user
def main():
    print("Enter the first number")
    num1=int(input())
    print("Enter the second number")
    num2=int(input())

    for number in range(num1,num2+1):
        if(number % 2 ==0):
            print("Even number")
        else:
            print("Odd Number")


if __name__=="__main__":
    main()
            

    