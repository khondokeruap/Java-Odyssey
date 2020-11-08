package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;

/*
7. Write a Java program to remove a specific element from an array.
 */
public class W3array_7 {
    static Scanner reader = new Scanner(System.in);
public static void main(String[] args) {
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Original Array : "+ Arrays.toString(my_array));

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


      int removeIndex = 1;
      for(int i = removeIndex; i < my_array.length -1; i++){
              my_array[i] = my_array[i + 1];
      }
      System.out.println("After removing the second element: "+Arrays.toString(my_array));
   }
}
