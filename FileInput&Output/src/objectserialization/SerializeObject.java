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
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("students.txt");
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Tom", 3.9));
        students.add(new Student("Dave", 4.0));
        students.add(new Student("Bill", 3.0));
        
        FileOutputStream fo = new FileOutputStream(file); //write bytes to text file
        ObjectOutputStream output = new ObjectOutputStream(fo); //serialize data for writing to text file (disk)
        for (Student s : students) {
            output.writeObject(s);
        }
        output.close();
        fo.close();
        
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(is);

        try {
            while(true) {
                    Student s = (Student)input.readObject();
                    System.out.println(s);
            }
        } catch (EOFException ex) {
            
        }
        
        
        
                
    }
}
