package src.odyssey.java.assignments.loops.practice59for;
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
    public static void main(String[] args){
        int n,i;
        long sum=0;
        long t=1;
        System.out.print("Input the number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print(""+t);
            if (i<n)
            {
                System.out.print(" + ");
            }
            sum=sum+t;
            t=(t*10)+1;
        }
        System.out.print("\nThe Sum is : "+sum);

    }

}
