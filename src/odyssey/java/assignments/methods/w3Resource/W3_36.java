package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*
36. Write a program in C to display the such a pattern for n number of rows using a number which will start with the number 1 and the first and a last number of each row will be 1. Go to the editor
  1
 121
12321
 */
public class W3_36 {
static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        pattern1();
    }
    public static void pattern1(){
        int i,j,n;
        System.out.print("Input number of rows : ");

        n = in.nextInt();
        i=0;
        while (i<=n)
        {
            for(j=1;j<=n-i;j++)
                System.out.print(" ");

            for(j=1;j<=i;j++)
                System.out.print(j);

            for(j=i-1;j>=1;j--)
                System.out.print(j);

            System.out.print("\n");
            i++;
        }
    }
}
