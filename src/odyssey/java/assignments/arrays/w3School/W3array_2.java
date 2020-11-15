package src.odyssey.java.assignments.arrays.w3School;
import java.util.Scanner;
/*
2. Write a Java program to sum values of an array.
 */
public class W3array_2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        sum();
    }
    public static void sum() {
        System.out.println("Enter the size of Integer array: ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter data for [" + i + "]: ");
            numbers[i] = in.nextInt();
        }
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println("Sum of given array is " + sum);
    }
}
