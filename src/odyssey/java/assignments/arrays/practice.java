package src.odyssey.java.assignments.arrays;

import java.util.Scanner;

public class practice {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter How many numbers you want to store: ");
        int A = reader.nextInt();
        reader.nextLine();
        String[] arr = new String[A];
        for (int i = 0; i < arr.length; i++) {  // names.length --> 1
            System.out.println("Please Enter Your Name: ");
            arr[i] = reader.nextLine();

        }
        for(int i=0;i<arr.length;i++) {
            System.out.println("names[" + i + "]: " + arr[i]);
        }
    }
}