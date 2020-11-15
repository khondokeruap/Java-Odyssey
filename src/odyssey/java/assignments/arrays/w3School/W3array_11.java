package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;
/*
11. Write a Java program to reverse an array of integer values.
 */
public class W3array_11 {
static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
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
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(numbers));
    }
}
