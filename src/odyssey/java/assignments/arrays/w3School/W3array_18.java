package src.odyssey.java.assignments.arrays.w3School;
import java.util.Arrays;
import java.util.Scanner;

/*
18. Write a Java program to find the second smallest element in an array.
 */
public class W3array_18 {
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
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==min){
                second_min=min;
            } else if (numbers[i] < min) {
                second_min = min;
                min = numbers[i];
            } else if (numbers[i] < second_min) {
                second_min = numbers[i];
            }
        }
        System.out.println("Second lowest number is : " + second_min);
    }
}
