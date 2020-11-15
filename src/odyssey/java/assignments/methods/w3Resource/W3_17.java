package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*
17. Write a program in java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor
   1
  2 2
 3 3 3
4 4 4 4
 */
public class W3_17 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        pyramid3();
    }
    public static void pyramid3(){
        int i,j,n,s,x;
        System.out.print ("Input number of rows : ");
        n = in.nextInt();
        s=n+4-1;
        i=1;
        while (i<=n)
        {
            x=s;
            while(x!=0)
            {
                System.out.print(" ");
            x--;
            }
            j=1;
            while(j<=i)
            {
                System.out.print(i+" ");
            j++;
            }
            System.out.println();
            s--;
            i++;
        }
    }
}
