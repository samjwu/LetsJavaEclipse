package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

//This will throw an InputMismatchException if a non-integer is entered
public class Basic {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	       boolean gotinput = false;

	       //run the code at least once
	       do {
	    	   //code to try
	    	   try {
	    		   Scanner input = new Scanner(System.in);
	    		   System.out.print("Enter an integer : ");
	    		   int i = input.nextInt();
	    		   System.out.printf("You entered the integer %d\n", i);
	    		   gotinput = true; //will not occur if exception is thrown
	    	   }
	    	   //exception handling - occurs if try has an error
	    	   catch (InputMismatchException exception) {
	    		   System.out.println("Exception. You didn't enter an integer.");
	    	   }
	    	   //code that always runs (regardless of whether try or catch ran)
	    	   finally {
	    		   System.out.println("Finally code happens whether the exception occurs or not");
	    	   }
	       } while (!gotinput); //continue running code until get valid input
	    }
}
