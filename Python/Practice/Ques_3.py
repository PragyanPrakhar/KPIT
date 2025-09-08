# Fibonacci Number
# we have to find first 
def fibonacciNumber(n):
    firstNumber = 0
    secondNumber = 1
    result = []   # store numbers
    for number in range(1,n+1):
        result.append(firstNumber)
        firstNumber,secondNumber=secondNumber,firstNumber+secondNumber
    return result
        
        
print(fibonacciNumber(5))
    