package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*
18. Write a program in java to find the sum of the series [ 1-X^2/2!+X^4/4!- .........]. Go to the editor
Test Data :
Input the Value of x :2
Input the number of terms : 5
Expected Output :
the sum = -0.415873
Number of terms = 5
value of x = 2.000000
 */
public class W3_18 {
    public static void main(String[] args){
        float x,sum,t,d;
        int i,n;
        System.out.print("Input the Value of x :");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.print("Input the number of terms : ");
        n = in.nextInt();
        sum = 1; t = 1;
        for (i=1;i<n;i++)
        {
            d = (2*i)*(2*i-1);
            t = -t*x*x/d;
            sum = sum+ t;
        }
        System.out.print("\nThe sum = " +sum+"\nNumber of terms = " +n+"\nvalue of x = "+x);
    }
}
