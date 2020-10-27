package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*
24. Write a program in C to find the sum of the series [ x - x^3 + x^5 + ......]. Go to the editor
Test Data :
Input the value of x :2
Input number of terms : 5
Expected Output :
The values of the series:
2
-8
32
-128
512
The sum = 410
 */
public class W3_24 {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        sumserise();
    }
    public static void sumserise(){
        int x,sum,ctr;
        int i,n,m,mm,nn;
        System.out.print("Input the value of x :");
        x = in.nextInt();
        System.out.print("Input number of terms : ");
        n = in.nextInt();
        sum =x; m=-1;
        System.out.print("The values of the series: ");
        System.out.print("\n"+x);
        i = 1;
        while( i < n)
        {
            ctr = (2 * i + 1);
            mm = (int) Math.pow(x, ctr);
            nn = mm * m;
            System.out.print("\n"+nn);
            sum = sum + nn;
            m = m * (-1);
        i++;
        }
        System.out.print("\nThe sum = "+sum);
    }
}
