package src.odyssey.java.assignments.arrays.w3School;

import java.util.Arrays;
import java.util.Scanner;

/*
28. Write a Java program to get the difference between the largest and smallest values in an array of integers.
The length of the array must be 1 and above.
 */
public class W3array_28 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Please enter how many times you want to store data for integer array: ");
        int n= reader.nextInt();
        int numbers[]= new int[n];
        reader.nextLine();
        for(int i=0;i<numbers.length;i++){
            System.out.println("Please enter your number for [ "+ i +" ]");
            numbers [i]= reader.nextInt();
        }
        for(int i=0;i<numbers.length;i++) {
//            System.out.println("Name ["+i+"]: "+numbers[i]);
        }
        System.out.println("Original numeric array : "+ Arrays.toString(numbers));
        int max_val = numbers[0];
        int min = numbers[0];
        for(int i = 1; i <numbers.length; i++)
        {
            if(numbers[i] > max_val)
                max_val = numbers[i];
            else if(numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));
    }
}
