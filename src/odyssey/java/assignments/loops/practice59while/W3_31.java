package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*
31. Write a program in C to display the pattern like a diamond. Go to the editor

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
public class W3_31 {
    public static void main(String[] args){
        int i,j,r;
        System.out.print("Input number of rows (half of the diamond) :");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        i=0;
        while (i<=r)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        i++;
        }
        i=r-1;
        while(i>=1)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
            i--;
        }

    }
}
