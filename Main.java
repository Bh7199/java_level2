package Grocery;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static Grocerylist grocerylist = new Grocerylist();

	public static void main(String[] args) {
		boolean quit = true;
		int choice = 0;
		printinstructions();
		
		while (quit) {
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 0:
				printinstructions();
				break;
			case 1:
				grocerylist.printgrocerylist();
				break;
			case 2:
				additem();

				break;
			case 3:
				modifyitem();
				break;
			case 4:
				removeitem();
				break;
			case 5:
				searchforitem();
				break;
			case 6:
				quit = false;
				break;
			}

		}

	}

	public static void printinstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 = to print choice options ");
		System.out.println("\t 1 = to print the list of grocery items ");
		System.out.println("\t 2 = to add an item to the list ");
		System.out.println("\t 3 = to modify an item to the list ");
		System.out.println("\t 4 = to remove an item from the list ");
		System.out.println("\t 5 = to search for an item in the list ");
		System.out.println("\t 6 = to quit the application  ");
	}

	public static void additem() {
		System.out.println("Please enter the grocery item: ");
		grocerylist.addgroceryitem(scan.nextLine());

	}

	public static void modifyitem() {
		System.out.println("Enter item number: ");
		int itemNo = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter replacement item: ");
		String newitem = scan.nextLine();
		grocerylist.modifygrocerylist(itemNo = 1, newitem);

	}

	public static void removeitem() {
		System.out.println("Enter item number:");
		int itemNo = scan.nextInt();
		scan.nextLine();
		grocerylist.removegroceryitem(itemNo = 1);

	}

	public static void searchforitem() {
		System.out.println("Item to search for: ");
		String searchitem = scan.nextLine();
		if (grocerylist.finditem(searchitem) != null) {
			System.out.println("Found " + searchitem + "in the gorcerylist.");

		} else {
			System.out.println(searchitem + " is not in the grocerylist.");
		}
	}

}
