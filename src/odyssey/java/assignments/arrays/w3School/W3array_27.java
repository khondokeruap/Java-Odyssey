package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;

/*
27. Write a Java program to find the number of even and odd integers in a given array of integers.
 */
public class W3array_27 {
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
        int ctr = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Number of even numbers : "+ctr);
        System.out.println("Number of odd numbers  : "+(numbers.length-ctr));
    }
}
