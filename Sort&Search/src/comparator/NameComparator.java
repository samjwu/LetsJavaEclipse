package comparator;

import java.util.Comparator;

/**
 * 
 * Comparator is a special class that returns an int comparison of two objects.
 * Custom comparator NameComparator will implement the common interface of Comparators with elements of type Student
 *
 */
public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
    
}