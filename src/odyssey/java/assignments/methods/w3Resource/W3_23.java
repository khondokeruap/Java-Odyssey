package src.odyssey.java.assignments.methods.w3Resource;
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
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        sumserise();
    }
    public static void sumserise(){
        float x,sum,no_row;
        int i,n;
        System.out.print("Input the value of x :");

        x = in.nextInt();
        System.out.print("Input number of terms : ");
        n = in.nextInt();
        sum =1; no_row = 1;
        i=1;
        while (i<n)
        {
            no_row = no_row*x/(float)i;
            sum =sum+ no_row;
        i++;
        }
        System.out.print("\nThe sum  is : "+sum+"000");
    }
}
