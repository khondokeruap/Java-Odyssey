package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*
26. Write a program in C to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. Go to the editor
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
 */
public class W3_26 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        sumserise();
    }
    public static void sumserise(){
        int n,i;
        long sum=0;
        long t=1;
        System.out.print("Input the number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i=1;
        while(i<=n)
        {
            System.out.print(""+t);
            if (i<n)
            {
                System.out.print(" + ");
            }
            sum=sum+t;
            t=(t*10)+1;
        i++;
        }
        System.out.print("\nThe Sum is : "+sum);
    }
}
