package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RunExample {

    public static void main(String[] args) {
        
        //Example of sorting using built-in java.util.Collections
    	
    	//generate 20 random numbers
        Random generator = new Random(3);
        int found = -1; //index number
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            numbers.add(generator.nextInt(100) + 1);
        }
        
        //unsorted list of generated numbers
        System.out.println("UNSORTED");
        printNumbers(numbers);
        found = find(numbers, 50); //find index of 50
        System.out.printf("The number %d was %s\n", 50, found<0 ? "not found" : "found");
 
        Collections.sort(numbers, new CompareInt()); //sort the list of numbers with lowest first
        //numbers = sort(numbers);
        
        //sorted list of generated numbers
        System.out.println("SORTED");
        printNumbers(numbers);
        
        //fin the number using binary search instead of linear search
        //int found = find(numbers, 50);
        found = Collections.binarySearch(numbers, 50, new CompareInt()); //args: list, key, comparator
        
        System.out.printf("The number %d was %s\n", 50, found<0 ? "not found" : "found");
       
    }
    
    
    /**
     * Enumerates the ArrayList nums, printing out the integers
     * @param nums: the ArrayList with integers to print.
     */
    public static void printNumbers(ArrayList<Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            System.out.printf("%d ", nums.get(i));
        }
        System.out.println();
    }
    
    
    /**
     * This code implements a linear search algorithm
     * @param a: the ArrayList to search
     * @param target: the value to find
     * @return Returns the index of the target in the ArrayList, otherwise -1
     */
    public static int find(ArrayList<Integer> a, Integer target) {
        int found = -1;
        for(int i = 0; i < a.size(); i++) {
            if (a.get(i) == target) {
                found = i;
                break;
            }
        }
        return found;
    }
    
    /**
     * This code implements a bubble sort algorithm
     * This bubble sort starts comparing from the end
     * and stops comparing the leftmost element after each iteration
     * @param a: ArrayList to sort
     * @return Sorted ArrayList a
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> a) {
        boolean swapped = false;
        int tmp = 0;
        for(int i = 0; i < a.size(); i++) {
            swapped = false;
            for(int j = a.size() - 1; j > i; j--) {
            	//swap if ele 2 is bigger than ele 1
                if (a.get(j) < a.get(j-1)) {
                    tmp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return a;
    }
}