package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
/*
9. Write a Java program to insert an element (specific position) into an array.
 */
public class W3array_9 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int Index_position = 2;
        int newValue       = 11; // when add new index position then last one is out of the boundary
        System.out.println("Original Array : "+ Arrays.toString(my_array));
        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array:       "+Arrays.toString(my_array));
    }
}
