package src.odyssey.java.assignments.loops.practice59;
import java.util.Scanner;
/*40. Write a C Program to display the pattern like pyramid using the alphabet. Go to the editor

        A
      A B A
    A B C B A
  A B C D C B A
 */
public class W3_40 {
    public static void main(String[] args){
        int i, j;
        char alph = 'A';
        int n,blk;
        int ctr = 1;

        System.out.print("Input the number of Letters (less than 26) in the Pyramid : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++)
        {
            for(blk=1;blk<=n-i;blk++)

                System.out.print("  ");
            for (j = 0; j <= (ctr / 2); j++) {
                System.out.print(" "+ alph++);
            }

            alph = (char) (alph - 2);

            for (j = 0; j < (ctr / 2); j++) {
                System.out.print(" "+ alph--);
            }
            ctr = ctr + 2;
            alph = 'A';
            System.out.print("\n");
        }
    }
}
