public class Book
{
   private int pages;
   private String title;
   
   public Book(int pages, String title)
   {
      this.pages = pages;
      this.title = title;
   }
   
   public int getPages()
   {
      return pages;
   }
   
   public void setPages(int new_pages)
   {
      pages = new_pages;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void changeTitle(String new_title)
   {
      title = new_title;
   }
   
   public String toString()
   {
      return ("Title: " + title + " Pages: " + pages);
   }
   
   public boolean ifEquals(Book book1, Book book2)
   {
      if ((book1.getTitle() == book2.getTitle()) && (book1.getPages() == book2.getPages()))
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   public int compareTo(Book book1)
   {
      int x = 0;
      
      if (this.getPages() > book1.getPages())
      {
         x = 1;
      }
      
      else if (this.getPages() < book1.getPages())
      {
         x = -1;
      }
      return x;
      
   }
}  