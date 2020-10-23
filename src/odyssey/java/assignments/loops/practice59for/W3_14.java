package src.odyssey.java.assignments.loops.practice59for;
/*
Write a program in C to make such a pattern like a pyramid with an asterisk
   *
  * *
 * * *
* * * *
 */
import java.util.Scanner;
public class W3_14 {
    public static void main(String[] args) {
            int i,j,r;
            System.out.print("Input number of rows : ");
            Scanner in = new Scanner(System.in);
            r = in.nextInt();
            for(i=0;i<=r;i++)
            {
                for(j=1;j<=r-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.print("\n");
            }

        }
}