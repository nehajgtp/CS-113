//********************************************************************
// Staff.java Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
//********************************************************************
public class Staff 
{
   StaffMember[] staffList;
   //-----------------------------------------------------------------
   // Sets up the list of staff members.
   //-----------------------------------------------------------------

   public Staff()
   {
      staffList = new StaffMember[4];

      staffList[0] = new Executive ("Sam", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07);

      staffList[1] = new Employee ("Carla", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15);

      staffList[2] = new Employee ("Woody", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23);

      staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55);
   }

   //-----------------------------------------------------------------
   // Pays all staff members.
   //-----------------------------------------------------------------
   public void payday()
   {
      double amount;
      
      for (int count=0; count < staffList.length; count++)
      {  
         System.out.println (staffList[count]);
         
         amount = staffList[count].pay(); // polymorphic

         if (amount == 0.0)
            System.out.println ("Thanks!");
         else
            System.out.println ("Paid: " + amount);
         
         System.out.println ("------------------------------------");
      }
      
   }
   
   public void printVacationDays()
   {
      System.out.println("Get vacation days: ");
      for (int c = 0; c < staffList.length; c++)
         {  
            System.out.println(staffList[c]);
            System.out.println("Vacation Days : "+ staffList[c].getVacationDays());
            System.out.println("-----------------------------------");
         } 
   }

}