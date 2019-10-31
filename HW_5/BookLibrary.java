import java.util.*;

public class BookLibrary
{
   public static void main(String[] args)
   {
      Book[] bookList = new Book[10];
      Scanner scan = new Scanner(System.in);
      scan.useDelimiter("");
      int option = 0;
      String title = ""; int pages = 0; int currentNoBooks = 0; int index_delete = 0;
      boolean bookExists = false; String newTitle = ""; int newPages = 0;
      String option_str = "";
      
      System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
      option_str = scan.nextLine();
      option = Integer.parseInt(option_str);   
      
      while(option > 0 && option < 4)
      {
      while (option == 1)
      {
         bookExists = false;

         if (bookList[9] != null)
         {
            System.out.println("Library is full.");
            System.out.println(Arrays.toString(bookList));
            System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
            option_str = scan.nextLine();
            option = Integer.parseInt(option_str);
               
         }
         
         else 
         {
            System.out.println("Enter book title: ");
            title = scan.nextLine();
            
            for (int i = 0; i < bookList.length; i++)
            {
               if (bookList[i] != null && bookList[i].getTitle().equals(title))
               {
                  bookExists = true;
               }
            }
            
            if (bookExists == true)
            {
               System.out.println("No duplicate books allowed.");
               System.out.println(Arrays.toString(bookList));
               System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
               option_str = scan.nextLine();
               option = Integer.parseInt(option_str);
            }
            
            else
            {
               System.out.println("Enter number of pages: ");
               String pages_str = scan.nextLine();
               pages = Integer.parseInt(pages_str);
               Book newBook = new Book(pages, title);
               bookList[currentNoBooks] = newBook;
               currentNoBooks++;
               System.out.println(Arrays.toString(bookList));
               System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
               option_str = scan.nextLine();
               option = Integer.parseInt(option_str);
            }
            
           }   
         }  
         
         while (option == 2)
         {
            if (bookList[0] == null)
            {
               System.out.println("Library is empty");
               System.out.println(Arrays.toString(bookList));
               System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
               option_str = scan.nextLine();
               option = Integer.parseInt(option_str);
            }

            else
            {
               System.out.println("Enter book title: ");
               title = scan.nextLine();
            
               for (int j = 0; j < bookList.length; j++)
               {
                  if (bookList[j] != null && bookList[j].getTitle().equals(title))
                  {
                     bookExists = true;
                     index_delete = j;
                  }
               }
               
               if (bookExists == false)
               {
                  System.out.println("Title does not exist.");
                  System.out.println(Arrays.toString(bookList));
                  System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
                  option_str = scan.nextLine();
                  option = Integer.parseInt(option_str);
               }
               
               else
               {
                  bookList[index_delete] = null;
                  System.out.println("Title deleted.");
                  currentNoBooks--;
                  System.out.println(Arrays.toString(bookList));
                  System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
                  option_str = scan.nextLine();
                  option = Integer.parseInt(option_str);
               }

            }
            
            
         } 
         
         while (option == 3)
         {
            if (bookList[0] == null)
            {
               System.out.println("Library is empty");
               System.out.println(Arrays.toString(bookList));
               System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
               option_str = scan.nextLine();
               option = Integer.parseInt(option_str);
            }
            
            else
            {
               System.out.println("Enter title of book to change: ");
               title = scan.nextLine();
            
               for (int k = 0; k < bookList.length; k++)
               {
                  if (bookList[k] != null && bookList[k].getTitle().equals(title))
                  {
                     bookExists = true;
                     index_delete = k;
                  }
               }   
               
               if (bookExists == true)
               {
                  System.out.println("Enter new title: ");
                  newTitle = scan.nextLine();
                  System.out.println("Enter number of pages: ");
                  String newPages_str = scan.nextLine();
                  newPages = Integer.parseInt(newPages_str);
                  
                  Book changeBook = new Book(newPages, newTitle);
                  bookList[index_delete] = changeBook;
                  System.out.println(Arrays.toString(bookList));
                  System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
                  option_str = scan.nextLine();
                  option = Integer.parseInt(option_str);
               }
               
               else
               {
                  System.out.println("Title does not exist");
                  System.out.println(Arrays.toString(bookList));
                  System.out.println("Enter a number: (1) Add , (2) Delete , (3) Change ");
                  option_str = scan.nextLine();
                  option = Integer.parseInt(option_str); 
               }
               
               
            }
            
         }       
         }
   }
      
}
