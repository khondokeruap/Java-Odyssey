package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;

/*
12. Write a Java program to find the duplicate values of an array of integer values.
 */
public class W3array_12 {
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

        for (int i = 0; i < numbers.length-1; i++)
        {
            for (int j = i+1; j < numbers.length; j++)
            {
                if ((numbers[i] == numbers[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+numbers[j]);
                }
            }
        }
    }
}
