package src.odyssey.java.practices.arrays;

import java.util.Scanner;

public class ArrayPracticeInt {
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args){

        System.out.println("Please enter how many times you want to store data: ");
        int n= in.nextInt();
        int numbers[]= new int[n];
        in.nextLine();
        for(int i=0;i<numbers.length;i++){
            System.out.println("Please enter your numbers: ");
            numbers [i]= in.nextInt();
        }

        for(int i=0;i<numbers.length;i++) {
            System.out.println("Name ["+i+"]: "+numbers[i]);
        }

    }
}
