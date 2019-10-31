import java.util.*;
public class myMethodsTester
{
   public static void main(String[] args)
   {
      myMethods var = new myMethods();
      int i = var.surface(1,2,3);
      System.out.println(i);  
      Die die3 = new Die();
      Die die4 = new Die();
      
      Die facevalue = var.comboDie(die3,die4);
      System.out.println(facevalue);

   }
}