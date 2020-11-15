package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;
/*
17. Write a Java program to find the second largest element in an array.
 */
public class W3array_17 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
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
        Arrays.sort(numbers);
        int index = numbers.length-1;
        while(numbers[index]==numbers[numbers.length-1]){
            index--;
        }
        System.out.println("Second largest value: " + numbers[index]);
    }
}
