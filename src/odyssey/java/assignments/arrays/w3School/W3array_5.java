package src.odyssey.java.assignments.arrays.w3School;
import java.util.Scanner;
/*
5. Write a Java program to test if an array contains a specific value.
 */
public class W3array_5 {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
                25,35,45,36,99,69,77};
        System.out.println(contains(my_array1, 99));
        System.out.println(contains(my_array1, 79));

    }
}