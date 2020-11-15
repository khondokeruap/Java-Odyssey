package src.odyssey.java.assignments.arrays.w3School;
import java.util.Scanner;
/*
4. Write a Java program to calculate the average value of array elements.
 */
public class W3array_4 {
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
//            System.out.println("Sum of given array is " + sum);
        }
        double average;
        average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
