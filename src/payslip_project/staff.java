package payslip_project;

import java.util.Scanner; // importing a scanner package

public class staff {
    private int id; // creating a variable for employee id
    private String title; // creating a variable for employee title
    private String firstname; // creating a variable for employee first name
    private String lastname; // creating a variable for employee last name
    private String dob; // creating a variable for employee date of birth
    private String ni; // creating a variable for employee national insurance number
    private String job_title; // creating a variable for employee job title
    private String department; // creating a variable for employee department
    
    
    // Creating a constructor 
    // keyword "this" refers to variables in the current object
    public staff(int id, String title, String firstname,String lastname, String dob, String ni, String job_title, String department) { 
        this.id=id;
        this.title=title;
        this.firstname=firstname;
        this.lastname=lastname;
        this.dob=dob;
        this.ni=ni;
        this.job_title=job_title;
        this.department=department;
    }
    
   public staff()
    {}

   public void input()
    {
        Scanner input = new Scanner(System.in); // creating an object of Scanner class
        System.out.println("\n=================================");
        System.out.println("Enter the Id: "); // asking the user to enter id
        id=input.nextInt(); // storing the user input into the id variable
        input.nextLine(); // we are using nextLine after nextInt to solve an issue with the java Scanner package where  the scanner is reading the integer and the enter pressed by the user after that which makes two inputs.
        System.out.println("Enter the title: "); // asking the user to enter title
        title=input.nextLine(); // storing the title in the title variable
        System.out.println("Enter the firstname: "); // asking the user for first name
        firstname=input.nextLine(); // storing the user input in the firstname variable
        System.out.println("Enter the lastname: "); // asking the user for the last name
        lastname=input.nextLine(); // storing the last name in the lastname variable
        System.out.println("Enter the Date of Birth: "); // asking the user for date of birth
        dob=input.nextLine(); // storing the date of birth in the dob variable
        System.out.println("Enter the National Insurance number: "); // asing the user for national insurance number
        ni=input.nextLine(); // storing the national insurance number in the ni varialbe
        System.out.println("Enter the Job Title: "); // asking the user for the job title
        job_title=input.nextLine(); // storing the job title in the job_title variable
        System.out.println("Enter the department: "); // asking the user for the department
        department=input.nextLine(); // storing the department in the department variable
        System.out.println("\n====================================");
    }
    
   public void print()
    {
     System.out.println("\n====================================");
     System.out.println("Id: "+ id); // printing the id
     System.out.println("Title: "+ title); // printing the title
     System.out.println("Firstname: "+ firstname); // printing the first name
     System.out.println("Lastname: "+ lastname); // printing the last name
     System.out.println("Dob: "+ dob); // printing the date of birth
     System.out.println("National Insurance: "+ ni); // printing the national insurance number
     System.out.println("Job title: "+ job_title); // printing the job title
     System.out.println("Department: "+ department); // printing the department
     System.out.println("\n====================================");
    }
    
  public int get_id() {
    return id;  // returning the id
} 
}
