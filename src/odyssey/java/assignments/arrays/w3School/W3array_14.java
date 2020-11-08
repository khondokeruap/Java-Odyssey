package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
14. Write a Java program to find the common elements between two arrays (string values).
 */
public class W3array_14 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Please enter how many times you want to store data for String array: ");
        int n=reader.nextInt();
        String names1[]= new String [n];
        reader.nextLine();
        for(int i=0;i<names1.length;i++){
            System.out.println("Please enter your name for [ " + i +" ]");
            names1 [i]= reader.nextLine();
        }

        for(int i=0;i<names1.length;i++) {
//            System.out.println("Name ["+i+"]: "+names[i].toUpperCase());
        }
        System.out.println("Original firsr string array : "+ Arrays.toString(names1));

        System.out.println("Please enter how many times you want to store data for String array: ");
//        reader.nextLine();
        String names2[]= new String [n];
        reader.nextLine();
        for(int i=0;i<names2.length;i++){
            System.out.println("Please enter your name for [ " + i +" ]");
            names2 [i]= reader.nextLine();
        }

        for(int i=0;i<names2.length;i++) {
//            System.out.println("Name ["+i+"]: "+names[i].toUpperCase());
        }
        System.out.println("Original firsr string array : "+ Arrays.toString(names2));
        System.out.println("Original Second string array : "+Arrays.toString(names2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < names1.length; i++)
        {
            for (int j = 0; j < names2.length; j++)
            {
                if(names1[i].equals(names2[j]))
                {
                    set.add(names1[i]);
                }
            }
        }
        System.out.println("Common element : "+(set));
    }
}
