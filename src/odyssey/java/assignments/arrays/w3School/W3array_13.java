package src.odyssey.java.assignments.arrays.w3School;

import java.util.Arrays;
import java.util.Scanner;

/*
13. Write a Java program to find the duplicate values of an array of string values.
 */
public class W3array_13 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Please enter how many times you want to store data for String array: ");
        int n=reader.nextInt();
        String names[]= new String [n];
        reader.nextLine();
        for(int i=0;i<names.length;i++){
            System.out.println("Please enter your name for [ " + i +" ]");
            names [i]= reader.nextLine();
        }

        for(int i=0;i<names.length;i++) {
//            System.out.println("Name ["+i+"]: "+names[i].toUpperCase());
        }
        System.out.println("Original string array : "+ Arrays.toString(names));

        for (int i = 0; i < names.length-1; i++)
        {
            for (int j = i+1; j < names.length; j++)
            {
                if( (names[i].equals(names[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+names[j]);
                }
            }
        }
    }
}
