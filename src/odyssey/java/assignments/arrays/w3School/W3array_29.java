package src.odyssey.java.assignments.arrays.w3School;

import java.util.Arrays;
import java.util.Scanner;

/*
29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.
 */
public class W3array_29 {
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
        int max = numbers[0];
        int min = numbers[0];
        float sum = numbers[0];
        for(int i = 1; i < numbers.length; i++)
        {
            sum  += numbers[i];
            if(numbers[i] > max)
                max = numbers[i];
            else if(numbers[i] < min)
                min = numbers[i];
        }
        float x = ((sum-max-min) / (numbers.length - 2));
        System.out.printf("The average value of an array of integers except the largest and smallest values: %.2f",x);
    }
}
