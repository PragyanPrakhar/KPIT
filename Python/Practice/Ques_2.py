def checkPrime(n):
    if(n <= 1):
        return False
    if(n==2):
        return True
    
    num=2;
    while num*num <=n:
        if(n%num==0):
            return False;
        num=num+1;
        
    return True;

print(checkPrime(9));
    