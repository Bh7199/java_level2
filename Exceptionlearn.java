package level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionlearn {

	public void Exception(String message) {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Learning level2 java programming");
		try {
			//System.out.println("Enter number");
			//int num=scan.nextInt();
		try {
			System.out.println("Enter number");
			int num=scan.nextInt();
		}
		catch(InputMismatchException i) {
			System.out.println("inputmismatchexception");
			
		}
			int a= 10;
			int b=0;
			int c = a/b;
			System.out.println(c);
			
		}
		catch( InputMismatchException a) {
			System.out.println("Inputtype not matched. ");
			a.printStackTrace();
		}
		catch(  ArithmeticException a) {
			System.out.println("operation cannot be performed");
		}
		finally {
			System.out.println("exit");
			scan.close();
		}
	}

	

}
// can we add multiple exceptions in a single try block and use different catch block to handle exceptions??
