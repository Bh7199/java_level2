package com.java_level2;

import java.util.Scanner;

public class EmployMain {
	EmployeeService Service = new EmployeeService();
	static boolean ordering = true;

	public static void options() {
		System.out
				.println("*******Welcome to employee management System*****" + "\n1.Add Employee" + "\n2.View Employee"
						+ "\n3.Update Employee" + "\n4.Delete Employee" + "\n5.View All Employee" + "\n6. Exit");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			options();
			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Employee");
				break;
			case 2:
				System.out.println("View Employee");
				break;
			case 3:
				System.out.println("Update Employee");
				break;
			case 4:
				System.out.println("Delete Employee");
				break;
			case 5:
				System.out.println("View All Employee");

				break;
			case 6:
				System.out.println("Thank you for using Application");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid choice: ");
			}
		} while (ordering);

	}

}
