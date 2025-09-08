# Library Management
# Create a Book class with attributes title, author, year, pages.
# Create a Library class holding multiple books.

# Tasks:

# get_longest_book() → book with max pages.

# get_books_before_year(year) → return books published before given year.

# get_avg_pages() → avg number of pages (use map + reduce).

# get_top_n_books_by_pages(n) → top n longest books.

# get_books_grouped_by_author() → return {author: [books]} (functional grouping style).
# Sample dataset for Library Management


class Book:
    def __init__(self,title,author,year,pages):
        self.title=title
        self.author=author
        self.year=year
        self.pages=pages
    
    def __repr__(self):
        return f"{self.__dict__}"

# Sample dataset using Book objects

books_data = [
    Book("The Hobbit", "J.R.R. Tolkien", 1937, 310),
    Book("1984", "George Orwell", 1949, 328),
    Book("To Kill a Mockingbird", "Harper Lee", 1960, 281),
    Book("A Game of Thrones", "George R.R. Martin", 1996, 694),
    Book("The Catcher in the Rye", "J.D. Salinger", 1951, 277),
    Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180),
    Book("Moby-Dick", "Herman Melville", 1851, 635),
    Book("War and Peace", "Leo Tolstoy", 1869, 1225),
    Book("Pride and Prejudice", "Jane Austen", 1813, 432),
    Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, 223),
]


def take_input()->list[Book]:
    number_of_books=int(input("Enter the number of books in the library"))
    books=[Book(input("Enter the title of the book"),input("Enter the author of the book"),input("Enter the year of the book"),int(input("Enter the number of pages in the book")))]
    return books

class Library:
    def __init__(self,books:list[Book]):
        self.books=books
    
    def get_longest_book(self)->Book:
        return max(self.books, key=lambda x : x.pages)

    def get_books_before_year(self,year:int)->list[Book]:
        return list(filter(lambda x:x.year < year,self.books))
    
    def get_avg_pages(self)->int:
        return sum(list(map(lambda x:x.pages , self.books)))/len(self.books)
    
    def get_top_n_books_by_pages(self,n:int)->list[Book]:
        return sorted(self.books , key=lambda x:x.pages , reverse=True)[:n]
    
    def get_books_grouped_by_author(self):
        unique_authors=set(list(map(lambda x:x.author , self.books)))
        final_dict={}
        for author in unique_authors:
            final_dict.setdefault(author,list(filter(lambda x:x.author==author , self.books)))
        return final_dict
    
    
    

def main():
    lib=Library(books_data)
    print(f"Longest book is {lib.get_longest_book()}")
    print(f"Books before year is {lib.get_books_before_year(1951)}")
    print(f"Average of pages in all the books is {lib.get_avg_pages()}")
    print(f"getting top n books by pages are {lib.get_top_n_books_by_pages(5)}")
    print(f"books grouped by the author is {lib.get_books_grouped_by_author()}")

main()