package src.odyssey.java.practices.arrays;
/*
1. Write a Java program to sort a numeric array and a string array.
 */
import java.util.Scanner;
import java.util.Arrays;
public class W3array_1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        chose();

    }
    public static void chose() {
        int i = 1;
        int choice;
        do {
            System.out.println("Press 1 for Integer.\nPress 2 for String .\nPress 3 for Exit.");
            System.out.println("Please Enter Your Choice: ");
            choice = reader.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Welcome to Integer !!!");
                    createArrayi();
                }
                break;
                case 2: {
                    System.out.println("Welcome to String!!!");
                    createArrays();
                }
                break;
                case 3:
                    System.out.println("Thank You for using the app!!!");
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice. Try Again");
            }
        } while (choice != 3);
    }
    public static int[] createArrayi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Integer array: ");
        int size = input.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter data for [" + i + "]: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public static String[] createArrays() {
        System.out.println("Please Enter How many String you want to store: ");
        int A = reader.nextInt();
        reader.nextLine();
        String[] arr = new String[A];
        for (int i = 0; i < arr.length; i++) {  // names.length --> 1
            System.out.println("Please enter name for [" + i + "]: ");
            arr[i] = reader.nextLine();
        }
        return arr;
    }
public static void new1(){

    Arrays.sort(createArrayi());
    System.out.println("Sorted numeric array : "+Arrays.toString(createArrayi()));
    }
    public static void new2() {
        Arrays.sort(createArrays());
        System.out.println("Sorted string array : " + Arrays.toString(createArrays()));
    }
}
