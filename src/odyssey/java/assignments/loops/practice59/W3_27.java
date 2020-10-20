package src.odyssey.java.assignments.loops.practice59;
import java.util.Scanner;
/*
27. Write a c program to check whether a given number is a perfect number or not. Go to the editor
Test Data :
Input the number : 56
Expected Output :
The positive divisor : 1 2 4 7 8 14 28
The sum of the divisor is : 64
So, the number is not perfect.
 */
public class W3_27 {
    public static void main(String[] args){
        int n,i,sum;
        int mn,mx;

        System.out.print("Input the  number : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        sum = 0;
        System.out.print("The positive divisor :");
        for (i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
                System.out.print(" "+i);
            }
        }
        System.out.print("\nThe sum of the divisor is : "+sum);
        if(sum==n)
            System.out.print("\nSo, the number is perfect.");
        else
            System.out.print("\nSo, the number is not perfect.");
        System.out.print("\n");
    }
}
