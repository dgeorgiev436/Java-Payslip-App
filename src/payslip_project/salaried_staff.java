
package payslip_project;

import java.util.Scanner; // importing scanner package

public class salaried_staff extends staff{ // keyword extends means that we creating a subclass of the base class we are extending
   
    double salary; // creating a variable salary
    String employementType;
    
 
    @Override // Allows us to override the input method
  public void input() {
     
     System.out.println("\n=============================================");
     super.input(); // calls the method defined in the superclass
     Scanner input = new Scanner(System.in); // creating an object of Scanner class
     System.out.println("Enter Salary: "); // asking the user to enter the salary
     salary=input.nextDouble();    // taking the user input into the salary variable
     System.out.println("Enter employement type: part-time / full-time");
     input.nextLine();
     employementType = input.nextLine();
   }
  
    @Override // Allows us to override the input method
  public void print() {
  System.out.println("\n=============================================");
  super.print(); // calls the method defined in the superclass
  System.out.println("\nSalary: "+salary); // printing the salary
  System.out.println("Employement type : " + employementType);
  System.out.println("\n=============================================");
  
  }
  
  public double get_salary()
  {return salary;} // returns the salary
    
}

