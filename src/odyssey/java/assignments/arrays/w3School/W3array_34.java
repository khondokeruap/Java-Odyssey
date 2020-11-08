package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
34. Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
 */
public class W3array_34 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
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
        System.out.println("Original array length: "+numbers.length);
//        System.out.print("Array elements are: ");
//        for (int i = 0; i < numbers.length; i++)
//        {
//            System.out.print(numbers[i]+" ");
//        }
        System.out.println("\nThe new length of the array is: "+longest_sequence(numbers));

    }

    public static int longest_sequence(int[] numbers) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : numbers) h_set.add(i);

        int longest_sequence_len = 0;
        for (int i : numbers) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }
}
