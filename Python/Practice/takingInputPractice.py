def main():
    n=int(input("Enter the length of the string"))
    listString=[]
    for _ in range(n):
        s=input("Enter a string :-> ")
        listString.append(s)
    
    vowels={"a","e","i","o","u","A","E","I","O","U"}
    
    for word in listString:
        found=False
        for ch in word:
            if ch in vowels:
                print(f"first vowel in the string '{word}' : {ch}")
                found=True
                break
        if not found:
            print(f"No vowels found in {word}")
    


if __name__=="__main__":
    main()