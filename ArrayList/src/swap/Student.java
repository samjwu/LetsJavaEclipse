package swap;

public class Student {
	private String Name;
    private double GPA;
    
    //constructor
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
    //print student name and gpa as string
    public String toString() {
        return String.format("%s\t%f", this.Name, this.GPA);
    }
}
