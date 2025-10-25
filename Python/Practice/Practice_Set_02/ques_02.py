def take_input():
    # str_list=list(map(input("Enter the list of the strings")))
    st=input("Enter the string !!")
    return st

#  ababa -> aba , bab , ababa
def palindromic_substrings(s:str)->list[str]:
    s=s.lower()
    pall_str=[]
    for i in range(0,len(s)-1):
        for j in range(i+1,len(s)):
            substr=s[i:j+1]
            if substr == substr[::-1]:
                pall_str.append(substr)
                
    return pall_str

def reverse_words(s:str)->str:
    # return s[::-1]
    s_lis=s.split()
    return " ".join(s_lis[::-1])

def count_vowels(s:str)->int:
    s=s.lower()
    num_vowels=0
    for ch in s:
        if ch in {'a','e','i','o','u'}:
            num_vowels=num_vowels+1
        
    return num_vowels

def is_anagram(s1:str,s2:str)->bool:
    s1=s1.lower()
    s2=s2.lower()
    for ch in s1:
        if ch not in s2:
            return False
        
    return True

def title_case(s1:str)->str:
    # s1=s1.capitalize()
    return " ".join([word.capitalize() for word in s1.split()])
    # return s1
    
    


def main():
    pall_list=palindromic_substrings("Madam, I'm Adam")
    print(f"Pallindromic substrings are : {pall_list}")
    
    reversed_words=reverse_words("Madam, I'm Adam")
    print(f"Reversed Words are : {reversed_words}")
    
    count_of_vowels=count_vowels("Madam, I'm Adam")
    print(f"Count of vowels are : {count_of_vowels}")
    
    ana=is_anagram("Hello","Olelh")
    print(f"Is Anagram : {ana}")
    
    tit_case=title_case("Madam, I'm Adam")
    print(f"Title case : {tit_case}")
    

if __name__=="__main__":
    main()