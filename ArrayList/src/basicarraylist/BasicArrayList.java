package basicarraylist;

import java.util.ArrayList;

public class BasicArrayList {
	public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);
        
        for (int i = 0; i < grades.size(); i++) {
        	System.out.printf("Grade: %d\n", grades.get(i));
        }
    }
}
