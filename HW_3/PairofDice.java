public class PairofDice
{
   private Die die1;
   private Die die2;
   private String color1;
   private String color2;
   private int fv1, fv2;
   
   public PairofDice()
   {
      this.die1 = new Die();
      this.die2 = new Die();
   }
   
   public void rollIt()
   {
      fv1 = die1.roll();
      fv2 = die2.roll();
   }
   
   public String toString()
   {
      return ("The colors of both dice are " + this.die1.setColor("Blue")  + " and " +  this.die2.setColor("Red"));
   }
   
   public int pairSum()
   {
      return (fv1+fv2);
   }
}