package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Run {
	public static void main(String[] args) {
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> compsci = new ArrayList<Student>();
        
        // Adding some students
        compsci.add(new Student("Bill",4.0));
        compsci.add(new Student("Adam",3.6));
        compsci.add(new Student("Carrie",3.15));
        
        System.out.println("UNSORTED");
        printStudents(compsci);
        
        System.out.println("SORT BY NAME");
        Collections.sort(compsci, new NameComparator());
        printStudents(compsci);
        
        System.out.println("SORT BY GPA");
        Collections.sort(compsci, new GPAComparator());
        printStudents(compsci);
        
    }
    
    public static void printStudents(ArrayList<Student> students) {
        System.out.printf("Name\tGPA\n");
        for( Student s : students) {
            System.out.printf("%s\n",s);
        }
        System.out.println();
    }
}
