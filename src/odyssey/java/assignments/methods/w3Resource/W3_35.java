package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*
35. Write a program in C to display the first n terms of Fibonacci series. Go to the editor
Fibonacci series 0 1 2 3 5 8 13 .....
Test Data :
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34
 */
public class W3_35 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci(){
        int n1=0,n2=1,n3,i,count;
        System.out.print("Input number of terms to display : ");

        count = in.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1
        i=2;
        while (i<count)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        i++;
        }

    }
}
