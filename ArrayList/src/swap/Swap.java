package swap;

import java.util.ArrayList;

import school.Student;

public class Swap {
	public static void main(String[] args) {
        //ArrayLists are dynamic collections of objects (reference types only)
        ArrayList<Student> compsci = new ArrayList<>();        
        
        //Add students to Student ArrayList
        compsci.add(new Student("Arnold", 3.0));
        compsci.add(new Student("Bob", 3.3));
        compsci.add(new Student("Cam", 4.0));
        compsci.add(new Student("Dale", 3.7));
        
        //Show students
        printStudents(compsci);
        
        //Remove a student
        Student tmp = compsci.remove(0);
        printStudents(compsci);
        
        //Add removed student to the back
        compsci.add(tmp);
        printStudents(compsci);
        
        //Add a new student to end
        compsci.add(new Student("Bill",3.7)); //can add to collections at any time
        printStudents(compsci);

        //Swap students
        tmp = compsci.get(1); //Place student 1 in tmp 
        compsci.set(1, compsci.get(2)); //Put student 2 in student 1's position
        compsci.set(2, tmp); //Put tmp (student 1) in student 2's position
        printStudents(compsci);
    }
    
	//function to print all students
    public static void printStudents(ArrayList<Student> all) {
        System.out.printf("Student\tGPA\n");
        System.out.printf("-------\t-------\n");
        
        //for loop using index
        for(int i = 0; i < all.size(); i++) {
            System.out.printf("%s\n",all.get(i));
        }
        
        //for loop using enumeration
        for(Student s : all) {
        	//s.println();
        }
        System.out.println();
    }
}
