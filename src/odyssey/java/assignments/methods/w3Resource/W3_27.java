package src.odyssey.java.assignments.methods.w3Resource;
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
static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        perfect();
    }
    public static void perfect(){
        int n,i,sum;
        int mn,mx;
        System.out.print("Input the  number : ");

        n = in.nextInt();
        sum = 0;
        System.out.print("The positive divisor :");
        i=1;
        while (i<n)
        {
            if(n%i==0)
            {
                sum=sum+i;
                System.out.print(" "+i);
            }
        i++;
        }
        System.out.print("\nThe sum of the divisor is : "+sum);
        if(sum==n)
            System.out.print("\nSo, the number is perfect.");
        else
            System.out.print("\nSo, the number is not perfect.");
        System.out.print("\n");
    }
}
