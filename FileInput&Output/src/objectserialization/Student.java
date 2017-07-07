package objectserialization;

import java.io.Serializable;

/**
 * 
 * Serialization is converting an object to series of bytes to be written to disk.
 * Deserialization is the reverse process (bytes to object).
 *
 */
@SuppressWarnings("serial")
public class Student implements Serializable {
	private String Name;
    private double GPA;    
    
    public Student(String name, double gpa) {
        this.Name = name;
        this.GPA = gpa;
    }
    
    public String getName() {
        return this.Name;
    }
    
    public String setName(String newName) {
        return (this.Name = newName);
    }
    
    public double getGPA() {
        return this.GPA;
    }
    
    public double setGPA(double newGPA) {
        return (this.GPA = newGPA);
    }
    
    @Override
    public String toString() {
       return String.format("%s\t%f", this.Name, this.GPA);
    }
}
