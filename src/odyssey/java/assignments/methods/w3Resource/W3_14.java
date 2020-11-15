package src.odyssey.java.assignments.methods.w3Resource;
/*
Write a program in C to make such a pattern like a pyramid with an asterisk
   *
  * *
 * * *
* * * *
 */
import java.util.Scanner;

public class W3_14 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        pyramid2();
    }
    public static void pyramid2(){
        int i,j,r;
            System.out.print("Input number of rows : ");

            r = in.nextInt();
            i=0;
            while(i<=r)
            {
                for(j=1;j<=r-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.print("\n");
            i++;
            }
    }
}