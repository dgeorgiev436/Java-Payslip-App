package payslip_project;

import java.util.Scanner; // importing a scanner

public class commission_staff extends staff{
   private double salary; // declaring variable for salary
   private double rate; // declaring variable for rate;
   
   @Override   // Allows us to override the input method
   public void input() { 
   System.out.println("\n=============================================");
     super.input();  // calls the method defined in the superclass
     Scanner input = new Scanner(System.in); // creating an object of Scanner class
     System.out.println("Enter Salary: "); // asking the user to enter the salary
     salary=input.nextDouble();   // getting the user input into salary variable
     System.out.println("Enter the commission rate: "); // asking the user of commission rate
     rate=input.nextDouble(); // getting the user input into rate variable
   }
   
   @Override // Allows us to override the input method
   public void print() {
  System.out.println("\n=============================================");
  super.print(); // calls the method defined in the superclass
  System.out.println("\nSalary: "+salary); // printing the salary
  System.out.println("\nCommisiion rate: "+rate); // printing the rate
  System.out.println("\n=============================================");
   }
   
   
   public double get_salary()
   {return salary;} // returns the salary
   
   public double get_rate()
   {return rate;} // returns the rate
   
}
