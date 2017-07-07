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
        
        FileOutputStream fo = new FileOutputStream(file); //write bytes to text file
        ObjectOutputStream output = new ObjectOutputStream(fo); //serialize object into data for writing to text file (disk)
        for (Student s : students) {
            output.writeObject(s);
        }
        //MUST close handles (so that other programs may access file)
        output.close();
        fo.close();
        
        FileInputStream is = new FileInputStream(file); //read bytes from text file
        ObjectInputStream input = new ObjectInputStream(is); //deserialize data to object for reading

        try {
            while(true) {
                    Student s = (Student) input.readObject(); //typecast object into Student
                    System.out.println(s);
            }
        } catch (EOFException ex) {
            
        }
        
        
        
                
    }
}
