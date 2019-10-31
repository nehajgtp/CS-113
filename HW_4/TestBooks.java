import java.util.*;

public class TestBooks
{
  public static void main(String[] args)
  {
    double minPages = Math.pow(10,6);
    String minBook = "";
    int totalPages = 0;
    double avg = 0;
    ArrayList<Book> list = new ArrayList<Book> ();
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How many books have you read?");
    int books = scan.nextInt();
    
    for (int i = 0; i < books; i++)
    {
      System.out.println("How many pages was it?");
      int pages = scan.nextInt();     
      String title = scan.nextLine();
      System.out.println("What was the title?");
      title = scan.nextLine();
      System.out.println();
      
      Book book = new Book(pages, title);
      list.add(book);
    }
    
    for (int j = 0; j < list.size(); j++)
    {
      Book book = list.get(j);
      if (book.getPages() < minPages)
      {
         minPages = book.getPages();
         minBook = book.getTitle();
      }
      
      totalPages += book.getPages();
      avg = totalPages/books;
    }
    
    System.out.println("Shortest Book: " + minBook + " / Number of Pages: " + minPages);
    System.out.println("Average Pages: " + avg);
    
    
  } 
}