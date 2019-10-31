import java.util.Scanner;

public class Occurences
{
   public static void main(String[] args)
   {
      int[] count = new int[51];
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter integers (0-50 inclusive): ");
      while (scan.hasNext())
      {
         int n = scan.nextInt();
         if (n >= 0 && n <= 50)
         {
            count[n]++;
         }
         
         System.out.println("This is the count for all the integers input: ");
         for (int i = 0; i <= 50; i++)
         {
            if (count[i] > 0)
               System.out.println(i + ": " +count[i] + " time(s)");
         }
      } 
      
      scan.close();
   }
}