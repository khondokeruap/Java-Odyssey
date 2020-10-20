package src.odyssey.java.assignments.loops.practice59;
import java.util.Scanner;
/*
23. Write a program in C to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....]. Go to the editor
Test Data :
Input the value of x :3
Input number of terms : 5
Expected Output :
The sum is : 16.375000
 */
public class W3_23 {
    public static void main(String[] args){
        float x,sum,no_row;
        int i,n;
        System.out.print("Input the value of x :");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.print("Input number of terms : ");
        n = in.nextInt();
        sum =1; no_row = 1;
        for (i=1;i<n;i++)
        {
            no_row = no_row*x/(float)i;
            sum =sum+ no_row;
        }
        System.out.print("\nThe sum  is : "+sum);

    }
}
