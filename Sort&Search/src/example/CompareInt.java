package example;

import java.util.Comparator;

/**
 * 
 * Comparator is a special class that returns an int comparison of two objects.
 * Custom comparator CompareInt will implement the common interface of Comparators with elements of type Integer
 *
 */
public class CompareInt  implements Comparator<Integer> {

	//return either a positive, negative, or zero integer
    @Override
    public int compare(Integer t1, Integer t2) {
        return t1 - t2;
        //return t2 - t1 //for descending sort order
    }
    
}