/*******************************************
 * Name : Sharvin A/L Ramachandern
 * ID: 1191302556
 * Section: TC01 / TT4V
 * Area: Human Resource
 ******************************************/

import java.util.*;


 class HumanResource{

    // this class is used for salary of the employees 
    public class Payroll{

        private String name;
        private int salary;
        private int worktime;
        private double payment;

        Payroll(String n, int sal, int wt, double pay){

            name = n;
            salary = sal;
            worktime = wt;
            payment = pay;
        }
        public int getSalary(){
            return salary;            
        }
        public int getTime(){
            return worktime;
        }
        public String toString(){
            
            return("Payroll of employee "+name+" : " + salary+" * "+ worktime+" = RM "+ payment);
        }

    }

    // the base class for employees
    public class Person 
    {
     
        protected String name;
        protected String gender;

        // default constructor
        public Person(){};
         
        public Person(String nm, String gen){
            this.name= nm;
            this.gender= gen;
        }

        public String getName(){
            return name;
        } 

        public String getGender(){
            return gender;
        }
        public String toString(){
            return ("Name : " + name);
        }
    }

    public class Employee extends Person{

        Employee(String f_name, String sex){
            super(f_name, sex);
        };

        // Array for the employee details to be held.
        public ArrayList<Payroll> emppay = new ArrayList<Payroll>();

        // used to add details of employee to array
        void adddetails(String n, int sal, int wt, double pay){
            emppay.add(new Payroll(n, sal, wt, pay));
        }

        // prints all the employee details.
        void printtotal(){
            for (Payroll empo: emppay){
                System.out.println(empo);
            }
        }

        //Overriding of the toString 
        public String toString(){
            return ("Name of PIC : " + name);

        }

    }

    // a main menu for ease of access.
    public void menu(){
        
        System.out.print("\n[1] View Employee details");
        System.out.print("\t[2] Enter Employee details");
        System.out.print("\n[3] Quit program");
        System.out.print("\n-> ");

    } 


        



        
 }