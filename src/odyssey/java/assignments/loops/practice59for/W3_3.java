package src.odyssey.java.assignments.loops.practice59for;
/*
3. Write a program in java to display n terms of natural number and their sum.Go to the editor
Test Data : 7
Expected Output :
The first 7 natural number is :
1 2 3 4 5 6 7
The Sum of Natural Number upto 7 terms : 28
 */
import java.util.Scanner;

public class W3_3 {
    public static void main (String []args){
        int i, n, sum=0;
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number: ");
            n = in.nextInt();
        }
        System.out.println("The first "+ n +" natural numbers are : ");

        for(i=1;i<=n;i++)
        {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nThe Sum of Natural Number upto "+n+ " terms is : " +sum);
    }
}
