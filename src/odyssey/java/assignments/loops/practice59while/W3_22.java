package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;
/*
22. Write a program in C to print the Floyd's Triangle. Go to the editor
1
01
101
0101
10101
 */
public class W3_22 {
    public static void main(String[] args) {
        int i,j,n,p,q;
        System.out.println("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i=1;
        while(i<=n)
        {
            if(i%2==0)
            { p=1;q=0;}
            else
            { p=0;q=1;}
            for(j=1;j<=i;j++)
                if(j%2==0)
                    System.out.print(p);
                else
                    System.out.print(q);
            System.out.println(" ");
        i++;
        }
    }
}
