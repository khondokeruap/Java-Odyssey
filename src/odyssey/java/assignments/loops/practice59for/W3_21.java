package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*
21. Write a program in C to display the sum of the series [ 9 + 99 + 999 + 9999 ...]. Go to the editor
Test Data :
Input the number or terms :5
Expected Output :
9 99 999 9999 99999
The sum of the saries = 111105
 */
public class W3_21 {
    public static void main (String[]args){
        int n,i,t=9;
        int sum =0;
        System.out.println("Input the number or terms :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i=1;i<=n;i++)
        { sum +=t;
            System.out.print(" "+t);
            t=t*10+9;
        }
        System.out.println("\nThe sum of the series = "+sum);

    }

}

