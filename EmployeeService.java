package com.java_level2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
	//Arraylist for employee
	ArrayList<Employee>emplist= newArraylist<Employee>();
	Employee emp1 = new Employee(50, "Bhuwan", "bhatta", 27, "Kathmandu");
	Employee emp2 = new Employee(51, "Saurav", "chand", 25, "Dhangadi");
	Employee emp3 = new Employee(52, "Asmita ", "Sapkota", 28, "Kathmandu");
	Employee emp4 = new Employee(54, "Pankaj", "Pandeya", 24, "Surkhet");

	Scanner scan = new Scanner(System.in);
	int id;
	String firstname;
	String lastname;
	int age;
	String address;
	 //creating constructor from Employee_service and mention Employee for Arraylist
	 public EmployeeService() {
	        emplist.add(emp1);
	        emplist.add(emp2);
	        emplist.add(emp3);
	        emplist.add(emp4);
	        
	 }  
	  //  create method for view all Employee
	    public void viewAllEmployee() {

	        for (Employee employee : emplist) {
	            System.out.println(employee);
	        }
	    }

	    //
	        

}
