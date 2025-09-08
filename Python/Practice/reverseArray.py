def main():
    arr=[2,3,4,5,6,7]
    start=0
    end=len(arr)-1
    while(start < end):
        temp=arr[start]
        arr[start]=arr[end]
        arr[end]=temp
        start=start+1
        end=end-1
    print(arr)


if __name__=="__main__":
    main()