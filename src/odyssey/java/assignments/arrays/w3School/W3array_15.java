package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;
/*
15. Write a Java program to find the common elements between two arrays of integers.
 */
public class W3array_15 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Please enter how many times you want to store data for integer array: ");
        int n= reader.nextInt();
        int number1[]= new int[n];
        reader.nextLine();
        for(int i=0;i<number1.length;i++){
            System.out.println("Please enter your number for [ "+ i +" ]");
            number1 [i]= reader.nextInt();
        }
        for(int i=0;i<number1.length;i++) {
//            System.out.println("Name ["+i+"]: "+numbers[i]);
        }

        reader.nextLine();
        System.out.println("Please enter how many times you want to store data for integer array: ");
        reader.nextLine();
        int number2[]= new int[n];

        for(int i=0;i<number2.length;i++){
            System.out.println("Please enter your number for [ "+ i +" ]");
            number2 [i]= reader.nextInt();
        }
        for(int i=0;i<number2.length;i++) {
//            System.out.println("Name ["+i+"]: "+numbers[i]);
        }
        System.out.println("Original numeric array one : "+ Arrays.toString(number1));
        System.out.println("Original numeric array two : "+ Arrays.toString(number2));

        for (int i = 0; i < number1.length; i++)
        {
            for (int j = 0; j < number2.length; j++)
            {
                if(number1[i] == (number2[j]))
                {

                    System.out.println("Common element is : "+(number1[i]));
                }

            }
        }System.out.println("No common element found");

    }
}
