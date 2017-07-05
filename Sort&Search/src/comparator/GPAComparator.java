package comparator;

import java.util.Comparator;

/**
 * 
 * Comparator is a special class that returns an int comparison of two objects.
 * Custom comparator GPAComparator will implement the common interface of Comparators with elements of type Student
 *
 */
public class GPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
            return (int) (1000 * (s1.getGPA() - s2.getGPA()));
    }
    
}