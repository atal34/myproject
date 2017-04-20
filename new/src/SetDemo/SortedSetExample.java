package SetDemo;

import java.util.TreeSet;

class Book1 implements Comparable
{
  private String isbn;
  private String bookName;
  private String author;
  
  Book1(String isbn, String bookName)
  {
    this.isbn = isbn;
    this.bookName = bookName;
  }  
  public String getBookName()
  {return bookName;}
  
  public int compareTo(Object o) {
      int bookOrder = this.bookName.compareTo(((Book1)o).getBookName());
      return bookOrder;      
  }
}


class Library1
{
  private TreeSet<Book1> bookRegister = new TreeSet<Book1>();
  
  public boolean addBook(Book1 newBook)
  {
      return bookRegister.add(newBook);
  }
  //adds only the instances which are not present in 
  //bookRegister
  public void addAllBooks(TreeSet<Book1> newBooks)
  {
      bookRegister.addAll(newBooks);
  } 
  
  public void displayAllBooks()
  {
    for(Book1 currentBook : bookRegister) {
        System.out.println(currentBook.getBookName());
    }
  }
}

class SortedSetExample {
    public static void main(String args[]) {
        Library1 ilpLibrary = new Library1();
        Book1 java = new Book1("1214232","Java Reference");
        Book1 oracle = new Book1("12324534","Oracle Reference");
        Book1 dotNet = new Book1("12421232", "DotNet Reference");
        Book1 cPlusPlus = new Book1("12521232", "C++ Reference");
        
        ilpLibrary.addBook(java);
        ilpLibrary.addBook(oracle);
        ilpLibrary.addBook(dotNet);
        ilpLibrary.addBook(cPlusPlus);
        
        
        
        TreeSet<Book1> newBooks = new TreeSet<Book1>();
        Book1 html = new Book1("1213445","HTML Reference");
        newBooks.add(oracle);
        newBooks.add(html);
        ilpLibrary.addAllBooks(newBooks);
        
        
        ilpLibrary.displayAllBooks();
    }
}
