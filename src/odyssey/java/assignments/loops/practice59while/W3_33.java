package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*33. Write a C program to display Pascal's triangle. Go to the editor
 Test Data :
Input number of rows: 5
Expected Output :
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
 */
public class W3_33 {
    public static void main(String[] args) {
        int no_row,c=1,blk,i,j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_row = in.nextInt();
        i=0;
        while(i<no_row)
        {
            for(blk=1;blk<=no_row-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
            i++;
        }
    }
}
