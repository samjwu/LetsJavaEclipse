package inputexception;

import java.util.InputMismatchException;
import java.util.Scanner;

//This will throw an InputMismatchException if a non-integer is entered
public class IntegerRange {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		boolean validinput = false;
	    int i;	    
	       
	    do {
	    	try {
	    		Scanner input = new Scanner(System.in); //must be in scope of try
	    		System.out.print("Enter an integer between 1 and 10: ");
	    		i = input.nextInt();
	    		if (i < 1 || i > 10) {throw new RangeException();}
	    		validinput = true;
	    		System.out.printf("You entered the integer %d\n", i);
	    	}
	    	//for invalid data type input
	    	catch (InputMismatchException ex) {
	    		System.out.println("You did not enter an integer.");
	    	}
	    	//for invalid data range input
	    	catch (RangeException ex) {
	    		System.out.println("Your input value is not in the specified range");
	    	}
	    } while (!validinput);
	}
}
