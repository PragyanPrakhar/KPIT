def char_freq(text:str)->dict:
    
    return {ch:text.lower().count(ch) for ch in text.lower() if ch.isalpha()}
    
    #freq_dict={}
    # for ch in text:
    #     if ch in freq_dict.keys():
    #         freq_dict[ch]=freq_dict[ch]+1
    #     else:
    #         freq_dict.update({ch:1})
    # return freq_dict 



def invert_dict(my_dict: dict) -> dict:
    inverted_dict = {}
    for value in my_dict.values():
        inverted_dict.setdefault(value, [])
        
    for key in my_dict.keys():
        inverted_dict[my_dict[key]].append(key)
    
    return inverted_dict
        
        
def merge_dicts(a: dict[any, int], b:dict[any, int]) -> dict[any, int]:
    for key in a.keys():
        if key in b.keys():
            b[key]=a[key]+b[key]
        else:
            b.update({key:a[key]})
    
    return b;

def filter_by_value(d: dict[any, int],threshold: int) -> dict[any, int] :
    return dict(list(filter(lambda p:p[1]>= threshold , d.items())))

def sort_by_key(d: dict[any, any]) -> list[tuple[any, any]]:
    return sorted(d.items(),key=lambda x:d[x])


    
    
    
    






def main():
    pass

if __name__=="__main__":
    main()
    