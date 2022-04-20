
package payslip_project;

import java.util.Scanner; // importing a scanner package

public class hourly_staff extends staff{ // keyword extends means that we creating a subclass of the base class we are extending
   private double hourly_rate; // declaring hourly_rate variable as a double 
   
   @Override // Allows us to override the input method
   public void input()
   {
     System.out.println("\n=============================================");
     super.input(); // calls the method defined in the superclass
     Scanner input = new Scanner(System.in); // creating an object of Scanner class
     System.out.println("Enter Hourly rate : "); // asking the user to enter the hourly rate
     hourly_rate=input.nextDouble(); // taking the user input into the hourly_rate variable
   }
   
   @Override // Allows us to override the input method
   public void print() {
  System.out.println("\n=============================================");
  super.print(); // calls the method defined in the superclass
  System.out.println("\nHourly rate: "+hourly_rate); // printing the hourly rate
  System.out.println("\n=============================================");
   }
   
   public double get_hourlyrate()
  {return hourly_rate;} // returns the hourly_rate
   
}
