# with open("example.txt","w") as file:
#     file.write("Hello, My name is Pragyan Prakhar")

# f=open("example.txt","r");
# content=f.read()
# print(content)
# print(len(content))

with open("example.txt", "r") as f:
    content = f.read()
    print(content)          # prints the file content
    print(len(content)) 
    #
    for word in content.join():
        print(word)