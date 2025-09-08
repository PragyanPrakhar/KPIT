def secondLargest(arr):
    largest=secLargest=float('-inf');
    for number in arr:
        if(number>largest):
            secLargest=largest;
            largest=number;
        elif(number > secLargest and number!=largest):
            secLargest=number
    return secLargest if secLargest!=float('-inf') else None;

print(secondLargest([10, 20, 4, 45, 99])) 
    
    