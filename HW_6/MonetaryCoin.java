import java.util.*;

public class MonetaryCoin extends Coin
{
   private int value;
   
   public MonetaryCoin()
   { 
      Random rand = new Random();
      value = rand.nextInt(100);
   }
   
   public int getValue()
   {
      return value;
   }
   
   public void setValue(int newValue)
   {
      value = newValue;
   }
   
   public String toString()
   {
      return value + "";
   }
   
   public static void main(String[] args)
   {
      MonetaryCoin[] coinArray = new MonetaryCoin[25];
      int totalTails = 0; int countTails = 0;
      double average;
      
      for (int i = 0; i < 25; i++)
      {
         MonetaryCoin coin = new MonetaryCoin();
         coinArray[i] = coin;
         if (coin.isHeads() == false)
         {
            int price = coin.getValue();
            totalTails += price;
            countTails++;
         }
      }
      
      if (countTails == 0)
      {
         System.out.println("N/A");
      }
      
      else
      {
         average = (double) totalTails/countTails;
         System.out.println(average);
         System.out.println(Arrays.toString(coinArray));
      }
   }
}