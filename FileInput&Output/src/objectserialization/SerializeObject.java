package objectserialization;

import java.io.*;
import java.util.ArrayList;

/**
 * 
 * Serialize: object to bytes
 * Deserialize: bytes to object
 * FileInputStream/FileOutputStream used for reading/writing bytes to files
 * ObjectInputStream/ObjectOutputStream used for deserializing/serializing data into object
 *
 */
public class SerializeObject {
	@SuppressWarnings("resource")
	//throws keyword specifies exceptions a method may cause to occur (throw)
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("students.txt");
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Abe", 3.9));
        students.add(new Student("Bob", 4.0));
        students.add(new Student("Cam", 3.0));
        
        //serialize collection (ArrayList) students into file students.txt
        //note students.txt is a binary file (machine readable bytes, not human readable text)
        FileOutputStream fo = new FileOutputStream(file); //write bytes to text file
        ObjectOutputStream output = new ObjectOutputStream(fo); //serialize object into binary data for writing to text file (disk)
        for (Student s : students) {
            output.writeObject(s);
        }
        //MUST close handles (so that other programs may access file)
        output.close();
        fo.close();
        
        //deserialize file students.txt into the collection (ArrayList) students
        FileInputStream fi = new FileInputStream(file); //read bytes from text file
        ObjectInputStream input = new ObjectInputStream(fi); //deserialize binary data to object for reading
        try {
            while(true) {
                    Student s = (Student) input.readObject(); //typecast object into Student
                    System.out.println(s);
            }
        } catch (EOFException ex) {
        	System.out.println("End of File");
        }    
    }
}
