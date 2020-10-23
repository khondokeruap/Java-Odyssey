package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*
8. Write a program in C to display the n terms of odd natural number and their sum . Go to the editor
Test Data
Input number of terms : 10
Expected Output :
The odd numbers are :1 3 5 7 9 11 13 15 17 19
The Sum of odd Natural Number upto 10 terms : 100
 */
public class W3_8 {
    public static void main (String[]args){
        Scanner reader=new Scanner(System.in);
        int i, n, sum=0;
        System.out.println("Please input the number of terms : ");
        n=reader.nextInt();
        System.out.println("The odd numbers are : ");
        i=1;
        while (i<=n)
        {
            System.out.println(2*i-1);
            sum+=2*i-1;
        i++;
        }
        System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
    }
}
