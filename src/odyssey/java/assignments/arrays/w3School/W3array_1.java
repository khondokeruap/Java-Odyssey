package src.odyssey.java.assignments.arrays.w3School;
/*
1. Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;
import java.util.Scanner;
public class W3array_1 {
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
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array : "+Arrays.toString(numbers));

        System.out.println("\nPlease enter how many times you want to store data for String array: ");
        reader.nextInt();
        String names[]= new String [n];
        reader.nextLine();
        for(int i=0;i<names.length;i++){
            System.out.println("Please enter your name for [ " + i +" ]");
            names [i]= reader.nextLine();
        }

        for(int i=0;i<names.length;i++) {
//            System.out.println("Name ["+i+"]: "+names[i].toUpperCase());
        }
        System.out.println("Original string array : "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted string array : "+Arrays.toString(names));
    }
}
