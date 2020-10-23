package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*
17. Write a program in java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor

   1
  2 2
 3 3 3
4 4 4 4

 */
public class W3_17 {
    public static void main(String[] args){
        int i,j,n,s,x;
        System.out.print ("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        s=n+4-1;
        for(i=1;i<=n;i++)
        {
            for(x=s;x!=0;x--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            s--;
        }



    }
}
