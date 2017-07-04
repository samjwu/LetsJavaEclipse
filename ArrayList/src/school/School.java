package school;

import java.util.ArrayList;

public class School {
	public static void main(String[] args) {
        //ArrayLists are dynamic collections of objects (which can be reference types only)
        ArrayList<Student> compsci = new ArrayList<>();
        
        //Add students to Student ArrayList
        compsci.add(new Student("Arnold", 3.0));
        compsci.add(new Student("Bob", 3.3));
        compsci.add(new Student("Cam", 4.0));
        compsci.add(new Student("Dale", 3.7));
        
        //Access as a collection
        System.out.println("Example using Enumeration");
        System.out.printf("Student\tGPA\n");
        //for each student in the compsci ArrayList
        for(Student s : compsci) {
            System.out.printf("%s\n", s);
        }
        System.out.println("");
        
        //Access with an index, similar to an array
        System.out.println("Example using Index");
        System.out.printf("Student\tGPA\n");
        for(int i = 0; i < compsci.size(); i++) {
            System.out.printf("%s\n",compsci.get(i));
        }
                
    }
}
