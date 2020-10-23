package src.odyssey.java.assignments.loops.practice59for;

import java.util.Scanner;

/*13. Write a program in C to make such a pattern like a pyramid with numbers increased by 1. Go to the editor
   1
  2 3
 4 5 6
7 8 9 10
 */
public class W3_13 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int i, j, rows, s, k, t=1;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();
        s = rows ;
        for(i=1;i<=rows;i++){
            for(k=s;k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(" " + t++);
            }
            System.out.println("");
            s--;
        }
    }
    }

