import java.util.*;

public class myMethods
{  
   public int surface(int width, int length, int depth)
   {
      int sa = (2*width*length)+(2*length*depth)+(2*width*depth);
      return sa;
   }
   
   public double rightTriangle(double sideA, double hypotenuseB)
   {
      double side3 = Math.sqrt(Math.pow(hypotenuseB,2)-Math.pow(sideA,2));
      return side3;
   }
       
   public Die comboDie(Die die1, Die die2)
   {
      die1.roll();
      die2.roll();
      int fv1 = die1.getFaceValue();
      int fv2 = die2.getFaceValue();
      int avg = (fv1+fv2)/2; 
      Die die3 = new Die();
      die3.setFaceValue(avg);
      return die3;
   }
}
