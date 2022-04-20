package payslip_project;
import java.io.IOException; // importing java package
import java.util.LinkedList; // importing java package
import java.util.Scanner; // importing java package
import static payslip_project.menu.*; 

public class Payslip_Project {

    public static void main(String[] args) throws IOException {
        int ch, sub; // declaring two variables. One for user menu choice and one for the user subchoice
        String ans="y";
        Scanner input = new Scanner(System.in); // creating an object of Scanner class
        
        salaried_staff ss= new salaried_staff();  // creating objects of the different staffs.
        hourly_staff hs= new hourly_staff(); // creating objects of the different staffs.
        commission_staff cs= new commission_staff(); // creating objects of the different staffs.
        
        LinkedList<salaried_staff> lss = new LinkedList<salaried_staff>(); // Creating a linkedList to store data ( this is like an array )
        LinkedList<hourly_staff> lhs = new LinkedList<hourly_staff>(); // Creating a linkedList to store data ( this is like an array )
        LinkedList<commission_staff> lcs = new LinkedList<commission_staff>(); // Creating a linkedList to store data ( this is like an array )
        
        // using a while loop
        while (ans.equals("y")) { // execute while ans equals "y"
        main_menu(); // Calling the main_menu method
        ch=input.nextInt(); // asking the user for the menu choice
        if (ch==1) // if user chooses 1 we execute register employee
        {
          register_menu(); // calling the register_menu method
          sub=input.nextInt(); // asking the user for their sub choice
          if (sub==1) {ss.input(); lss.add(ss);} // if users sub choice equals to 1 ( Salaried employee ) we store the data in the lss LinkedList
          if (sub==2) {hs.input(); lhs.add(hs);} // if users sub choice equals to 2 ( Hourly employee ) we store the data in the lhs LinkedList
          if (sub==3) {cs.input(); lcs.add(cs);} // if users sub choice equals to 3 ( Commission employee ) we store the data in the lcs LinkedList
          System.out.print("\nSuccessfully Registered....Press enter  to continue.."); // Pringint a message to the user
          System.in.read(); // waiting for the user to press any key to continue
        }
        
         if (ch==2) { // if the user choooses 2 we execute view employee
          view_menu(); // calling the view_menu method
          sub=input.nextInt(); // asking the user for their sub choice
          if (sub==1) // if the user sub choice is 1 ( view salaried employees )
          {
              System.out.print("Enter the salaried staff Id: "); // aksing the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lss.size(); i++) // using a for loop 
              {salaried_staff element=lss.get(i);
               if (element.get_id()==id) {element.print();} // if the id is matching the id of the employee we print the employee details
              }
          }
         
          
          if (sub==2) // if the user sub choice is 2 ( view Hourly staff )
          {
           System.out.print("Enter the Hourly staff Id: "); // asking the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lhs.size(); i++) // using a for loop
              {hourly_staff element=lhs.get(i);
               if (element.get_id()==id) {element.print();} // if the id is matching we print the employee details
              }
          }
          if (sub==3)  // if the user sub choice is 3 ( view Commission staff )
          {
          System.out.print("Enter the Commission staff Id: "); // asking the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lcs.size(); i++) // using a for loop
              {commission_staff element=lcs.get(i);
               if (element.get_id()==id) {element.print();} // if the id is matching we print the employee detials
              }
          }
          
          if (sub==4) // if the user subchoice is 4 ( view all employees ) 
          {
              // Pringint all the employees
          for (int i = 0; i<lss.size(); i++)
              {salaried_staff element=lss.get(i); element.print();}
          for (int i = 0; i<lhs.size(); i++)
              {hourly_staff element=lhs.get(i); element.print();}
          for (int i = 0; i<lcs.size(); i++)
              {commission_staff element=lcs.get(i); element.print();}
          
          }
        }
         
         
         
         
          if (ch==3) // if users choice is 3 ( remove employee )
        {
        
         delete_menu(); // claling for the delete_menu method
          sub=input.nextInt(); // asking the user for their sub choice
          if (sub==1) // if the sub choice is 1 ( delete salaried staff )
          {
              System.out.print("Enter the salaried staff Id to delete: "); // asking the user for id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lss.size(); i++) // using a for loop
              {salaried_staff element=lss.get(i);
               if (element.get_id()==id) {lss.remove(i);} // if the id is matching delete the employee
              }
          }
         
          
          if (sub==2) // if the sub choice is 2 ( delete hourly staff )
          {
           System.out.print("Enter the Hourly staff Id to delete: "); // asking the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lhs.size(); i++) // using a for loop
              {hourly_staff element=lhs.get(i);
               if (element.get_id()==id) {lhs.remove(i);} // if the id is matching delete the employee
              }
          }
          if (sub==3)  // if the sub choice is 3 ( delete commission employee )
          {
          System.out.print("Enter the Commission staff Id to delete: "); // asking the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lcs.size(); i++) // using a for loop
              {commission_staff element=lcs.get(i);
               if (element.get_id()==id) {lcs.remove(i);} // if the id is matching delete the employee
              }
          }   
            
        }
        
         if (ch==4) // if user choice is 4 ( view payslip )
         {
        double hours;
          payslip_menu(); // calling for the payslip_menu method
          sub=input.nextInt(); // asking the user for the subchoice
          if (sub==1)  // if the subchoice is 1 ( salaried staff payslip )
          {
              System.out.print("Enter the salaried staff Id for payslip: "); // asking the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              for (int i = 0; i<lss.size(); i++) // using for loop
              {salaried_staff element=lss.get(i);
               if (element.get_id()==id) { // if the id is matching we are pringing the payslip
               System.out.print("\n==========Payslip===========");
               System.out.print("\n==========Payslip===========");
               System.out.print("\nCompany name: Marline Production LTD");
               System.out.print("\nTax : "+0.2*element.get_salary()); // printing the taxes
               System.out.print("\nNet pay : "+0.8*element.get_salary()); // pringing the salary
               System.out.print("\nTotal pay : "+ element.get_salary());
               System.out.print("\n==================================");
               }
              }
          }
          
          if (sub==2)  // if the subchoice is 2 ( hourly staff payslip )
          {
              System.out.print("Enter the Hourly staff Id for payslip: "); // asking the user for id
              int id=input.nextInt(); // storing the id in the id variable
              System.out.println("Enter the total hours worked");
              hours = input.nextDouble(); // variable holding the total hours worked
              for (int i = 0; i<lhs.size(); i++) // using for loop
              {hourly_staff element=lhs.get(i);
               if (element.get_id()==id) { // if the id matches we print the payslip
               System.out.print("\n==========Payslip===========");
               System.out.print("\n==========Payslip===========");
               System.out.print("\nCompany name: Marline Production LTD");
               System.out.print("\nTax : "+0.2*element.get_hourlyrate()*hours); // printing the tax
               System.out.print("\nNet pay : "+0.8*element.get_hourlyrate()*hours); // printing the net pay
               System.out.print("\nTotal Pay : " + element.get_hourlyrate()*hours);
               System.out.print("\n==================================");}
              }
          }
          if (sub==3) // if the sub choice is 3 ( commission staff payslip )
          {
             
          System.out.print("Enter the Commission staff Id for payslip: "); // asking the user for the id
              int id=input.nextInt(); // storing the id in the id variable
              System.out.println("Enter the number of sales");
              int sales = input.nextInt(); // declaring sales
              for (int i = 0; i<lcs.size(); i++) // using for loop
              {commission_staff element=lcs.get(i);
               if (element.get_id()==id) { // if the id is matching we print the payslip
               System.out.print("\n==========Payslip===========");
               System.out.print("\n==========Payslip===========");
               System.out.print("\nCompany name: Marline Production LTD");
               double income=element.get_salary()+element.get_rate()*sales; // calculating the income
               System.out.print("\nTax : " + 0.2 * income);
               System.out.print("\nNet pay : "+0.8*income); // priting the net pay
               System.out.print("\nTotal pay : "+ income);
               System.out.print("\n==================================");}
              }
          }     
            
            
        }
        
         if (ch==5) { // if the user choice is 5 ( exit )
        ans="n";
        }
        
        input.nextLine(); 
        System.out.print("Do you want to continue (y/n): "); // asking the user if they want to continue
        ans=input.nextLine(); // user input
        
        
         }   //end of while         
        
                
    }//end of the main program
    
}// end of class
