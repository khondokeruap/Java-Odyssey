package src.odyssey.java.assignments.arrays;

import java.util.Scanner;

public class class_note {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please Enter How many names you want to store: ");
        int size = reader.nextInt();
        reader.nextLine();

        String names[] = new String[size]; // --> 1

        // Initialize the array
        for(int i=0; i< names.length;i++){  // names.length --> 1
            System.out.println("Please Enter Your Name: ");
            names[i] = reader.nextLine();
        }

        //Traversing array
        // Print the array
        for(int i=0;i<names.length;i++){
            System.out.println( "names[" + i + "]: " + names[i]);

        }
        System.out.println(names.length);
    }


}
