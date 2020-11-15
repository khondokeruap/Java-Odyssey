package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;
/*
10. Write a Java program to find the maximum and minimum value of an array.
 */
public class W3array_10 {
    static int max;
    static int min;
    static Scanner reader = new Scanner(System.in);
    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }
    public static void main(String[] args) {
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        max_min(my_array);
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
        max_min(numbers);
        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);
    }
}
