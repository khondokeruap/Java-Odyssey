package src.odyssey.java.assignments.methods.w3Resource;
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
    static Scanner in = new Scanner(System.in);
    public static void main (String[]args) {
        sumSeries();
    }
    public static void sumSeries(){
        int n,i,t=9;
        int sum =0;
        System.out.println("Input the number or terms :");

        n = in.nextInt();
        i=1;
        while (i<=n)
        { sum +=t;
            System.out.print(" "+t);
            t=t*10+9;
        i++;
        }
        System.out.println("\nThe sum of the series = "+sum);
    }
}

