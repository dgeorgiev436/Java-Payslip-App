package payslip_project;
public class menu {
    
   public static void main_menu() {
       // Printing the main menu
    System.out.println("**************************************************");
    System.out.println("*              Payroll system                    *");
    System.out.println("**************************************************");
    System.out.println("1. Register employee");
    System.out.println("2. View Employee");
    System.out.println("3. Delete Employee");
    System.out.println("4. View payslip");
    System.out.println("5. Exit");
    System.out.println("Please enter your choice (1-5): ");
    }
   
   public static void delete_menu() {
       // Printing the delete menu
    System.out.println("**************************************************");
    System.out.println("1. Remove Salaried employee");
    System.out.println("2. Remove Hourly employee");
    System.out.println("3. Remove Commission employee");    
    System.out.println("Please enter your Sub-choice (1-3): ");
    }

   
   public static void view_menu() {
       // Printing the view menu
    System.out.println("**************************************************");
    System.out.println("1. View Salaried employee");
    System.out.println("2. View Hourly employee");
    System.out.println("3. View Commission employee");  
    System.out.println("4. View all employee");  
    System.out.println("Please enter your Sub-choice (1-4): ");
    }
   
   public static void payslip_menu() {
       // Printing the payslip menu
    System.out.println("**************************************************");
    System.out.println("1. View payslip for Salaried employee");
    System.out.println("2. View payslip for Hourly employee");
    System.out.println("3. View payslip for Commission employee");    
    System.out.println("Please enter your Sub-choice (1-3): ");
    }

   
   public static void register_menu() {
       // Printing the register menu
    System.out.println("**************************************************");
    System.out.println("1. Register Salaried employee");
    System.out.println("2. Register Hourly employee");
    System.out.println("3. Register Commission employee");    
    System.out.println("Please enter your Sub-choice (1-3): ");
    }
    
}
