package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
	       //This will throw an InputMismatchException a non-integer is entered
	       @SuppressWarnings("resource") //for unclosed Scanner resource input
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter an integer : ");
	       
	       //code to try
	       try {
			int i = input.nextInt();
	        System.out.printf("You entered the integer %d\n", i);
	       }
	       //exception handling - occurs if try has an error
	       catch (InputMismatchException exception) {
	           System.out.println("Exception. You didn't enter an integer.");
	       }
	       //code that always runs (regardless of whether try or catch ran)
	       finally {
	           System.out.println("Finally happens whether the exception occurs or not");
	       }
	    }
}
