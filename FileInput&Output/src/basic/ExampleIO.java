package basic;

import java.io.File; //java representation of file
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; //to write to file
import java.util.Scanner; //to read from file

public class ExampleIO {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		
		//write to test.txt file
		try {
            PrintWriter output = new PrintWriter(file);
            output.println("Testing test.txt");
            output.println("1, 2, 3");
            output.close();
        }
		//catch errors
		catch (IOException ex) {
            System.out.printf("ERROR: %s!\n", ex);
        }
        
		//read from test.txt file
        try {
            Scanner input = new Scanner( file );
            String message1  = input.nextLine();
            String message2  = input.nextLine();
            System.out.println(message1);
            System.out.println(message2);
        //catch errors
        } catch (FileNotFoundException ex) {
            System.out.printf("ERROR: %s!\n", ex);
        }
    }
}
