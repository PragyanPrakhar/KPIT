# removing duplicates from the sorted Array
def removeDuplicates(arr):
    ind=1;
    newList=[]
    while(ind<len(arr)):
        if(arr[ind-1]!=arr[ind]):
            newList.append(arr[ind-1]);
        ind=ind+1;
    return newList

print(removeDuplicates(sorted([1,2,2,3,4,1,5])));
    