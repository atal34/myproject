package SetDemo;



import java.util.HashSet;

class Book
{
  private String isbn;
  private String bookName;
  private String author;
  
  Book(String isbn, String bookName)
  {
    this.isbn = isbn;
    this.bookName = bookName;
  }  
  public String getBookName()
  {return bookName;}
}


class Library
{
  private HashSet<Book> bookRegister = new HashSet<Book>();
  
  public boolean addBook(Book newBook)
  {
      return bookRegister.add(newBook);
  }
  //adds only the instances which are not present in 
  //bookRegister
  public void addAllBooks(HashSet<Book> newBooks)
  {
      bookRegister.addAll(newBooks);
  } 
  
  public void displayAllBooks()
  {
    for(Book currentBook : bookRegister) {
        System.out.println(currentBook.getBookName());
    }
  }
}

public class HashSetExample {
    public static void main(String args[]) {
        Library ilpLibrary = new Library();
        Book java = new Book("1214232","Java Reference");
        Book oracle = new Book("12324534","Oracle Reference");
        Book dotNet = new Book("12421232", "DotNet Reference");
        Book cPlusPlus = new Book("12521232", "C++ Reference");
        
        ilpLibrary.addBook(java);
        ilpLibrary.addBook(oracle);
        ilpLibrary.addBook(dotNet);
        ilpLibrary.addBook(cPlusPlus);
        ilpLibrary.addBook(oracle);
        
        
        HashSet<Book> newBooks = new HashSet<Book>();
        Book html = new Book("1213445","HTML Reference");
        newBooks.add(oracle);
        newBooks.add(html);
        ilpLibrary.addAllBooks(newBooks);
        
        ilpLibrary.displayAllBooks();
    }
}