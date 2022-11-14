/*******************************************
 * Name : Puvarasan Ganesan
 * ID: 1171103933
 * Section: TC01 / TT4V
 * Area: Human Resource
 ******************************************/

import java.util.*;

// this is the main driver class for the program.
public class HRDriver extends HumanResource {


    public static void main(String[] args) {

        String n; // for name of employees
        String gen; // for employee gender
        int sal = 0;
        int wt = 0;
        double pay;

        // the main start page.
        System.out.println("\n.......Welcome to Employee Payroll System......");
        Scanner scan = new Scanner(System.in);

        //initialization
        HumanResource hr = new HumanResource();

        //data of person in charge in HR
        System.out.println("Please enter the name of person in charge (PIC) of current payroll");
        System.out.print("\n-> ");
        n = scan.nextLine();
        System.out.println("Enter PIC's gender(male/female)");
        System.out.print("\n-> ");
        gen = scan.nextLine();

        // input of data
        Employee empdetail = hr.new Employee(n, gen);

        //creation of menu
        hr.menu();

        Boolean loop=true;
        do{
            int choice=scan.nextInt();
            switch(choice){

                // to view employee details
                case 1:
                    System.out.println("\n");
                    System.out.println(empdetail);
                    empdetail.printtotal();
                    break;

                //to enter employee details
                case 2:
                    System.out.println("\n");
                    System.out.println("Enter employee name (First name only) ");
                    n = scan.next();
                    System.out.println("Enter employee gender(male/female)");
                    gen = scan.next();
                    System.out.println("Enter pay per hour RM ");
                    sal = scan.nextInt();
                    System.out.println("Enter total working time (hrs) for week ");
                    wt = scan.nextInt();
                    pay = sal*wt;
                    System.out.println(".........Details recorded......... ");
                    empdetail.adddetails(n, sal, wt, pay);
                    break;
                    
                //exit loop/program
		case 3:
		loop=false;
                    break;
                    
		default:
		System.out.println(" Wrong input. Please try again ");
			}
	if (loop)
	  hr.menu();
	
	}while(loop==true);       
    }
}
