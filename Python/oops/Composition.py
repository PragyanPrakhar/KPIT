class Book:
    def __init__(self,book_id:str,title:str,author:str,price:int):
        self.book_id=book_id
        self.title=title
        self.author=author
        self.price=price
    
    def __repr__(self):
        return f"{self.__dict__}"
    

class LibraryCard:
    def __init__(self,card_number:int,member_name:str,validity_years:int):
        self.card_number=card_number
        self.member_name=member_name
        self.validity_years=validity_years
    
    def __repr__(self):
        return f"{self.__dict__}"
    

class LibraryMember:
    def __init__(self,member_id:str,name:str,card:LibraryCard):
        self.member_id=member_id
        self.name=name
        self.card=card
    
    def __repr__(self):
        return f"{self.__dict__}"

class Library:
    def __init__(self,library_name:str,books:list[Book]):
        self.library_name=library_name
        self.books=books
    
    def add_book(self,book:Book):
        self.books.append(book)
    
    def list_books(self):
        print(f"Books available in {self.library_name}:")
        for book in self.books:
            print(f" - {book.book_id}: {book.title} by {book.author}, Price: {book.price}")
    
    def __repr__(self):
        return f"{self.__dict__}"

class Borrow:
    def __init__(self,member:LibraryMember,book:Book):
        self.member=member
        self.book=book
    
    def __repr__(self):
        return f"{self.member.name} borrowed the book {self.book.title} by {self.book.author}"

def main()->None:
    # Create Books
    b1 = Book("B101", "The Hobbit", "J.R.R. Tolkien", 350)
    b2 = Book("B102", "1984", "George Orwell", 200)
    b3 = Book("B103", "Python OOP", "Mark Lutz", 500)
    lib = Library("City Library",[])
    lib.add_book(b1)
    lib.add_book(b2)
    lib.add_book(b3)
    card1 = LibraryCard(111, "Pragyan", 3)
    m1 = LibraryMember("M101", "Pragyan", card1)
    card2 = LibraryCard(222, "Rahul", 2)
    m2 = LibraryMember("M102", "Rahul", card2)
    t1 = Borrow(m1, b1)
    t2 = Borrow(m2, b3)
    print(t1)
    print(t2)
    lib.list_books()
    

if __name__=="__main__":
    main()



