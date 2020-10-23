package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*12. Write a program in C to make such a pattern like right angle triangle with number increased by 1. Go to the editor

The pattern like :

   1
   2 3
   4 5 6
   7 8 9 10
 */
public class W3_12 {
    public static void main (String []args) {
        int i, j, n, k = 1;

        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i = 1;
        while ( i <= n ) {

            for (j = 1; j <= i; j++)
                System.out.print(k++);
            System.out.println(" ");
            i++;
        }
        System.out.println("Thank you for using the app");
    }
}