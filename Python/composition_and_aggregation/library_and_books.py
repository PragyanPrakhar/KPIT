class Book:
    def __init__(self,year,author):
        self.book_year=year
        self.book_author=author
    
    def __repr__(self):
        return f"{self.__dict__}"
    
class Library:
    def __init__(self,library_name,books_list):
        self.library_name=library_name
        self.books_list=books_list
    
    def __repr__(self):
        return f"{self.__dict__}"
    

def main()->None:
    book1 = Book("1984", "George Orwell")
    book2 = Book("The Hobbit", "J.R.R. Tolkien")

    library = Library("City Library", [book1, book2])
    print(book1)
    print(book2)
    print(library)

if __name__=="__main__":
    main()