public class TestPairofDice
{
   public static void main(String[] args)
   {
      PairofDice pair1 = new PairofDice();
      pair1.rollIt();
      int sum = pair1.pairSum();
      System.out.println(sum);      
      
   }
}     