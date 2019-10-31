import java.util.*;
public class games 
{
   public static void main(String[] args)
   {
      int compPoints = 0;
      int persPoints = 0;
      Die die1 = new Die();
      Die die2 = new Die();
      
      while (compPoints < 100 && persPoints < 100)
      {
         Scanner scan = new Scanner(System.in);
         int compRoundPts = 0; int persRoundPts = 0;
         for (int i = 0; i < 3; i++)
         {
            
            die1.roll(); die2.roll();
            
            System.out.println("Enter a number between 2 and 12: ");
            int entry = scan.nextInt();
            
            if ((die1.getFaceValue() + die2.getFaceValue()) == entry)
            {
               persRoundPts = 5;
               persPoints += persRoundPts;
               compRoundPts = 0;
               persRoundPts = 0;
               i = 3;
               System.out.println("You won this round!");
            }     
            
            else
               compRoundPts +=1;
               System.out.println("Not the right number");  
                 
         }   
         if (compRoundPts == 3)
         {
            System.out.println("Computer won this round.");
         }
         compPoints += compRoundPts;          
      }
      
      if (compPoints >= 100)
         System.out.println("Computer wins!");
      else if (persPoints >= 100)
         System.out.println("You win!");
   }
}