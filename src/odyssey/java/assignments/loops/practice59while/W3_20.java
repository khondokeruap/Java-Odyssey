package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;
/*
Write a program in C to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks. Go to the editor
   *
  ***
 *****
 */
public class W3_20 {
    public static void main(String[]args){
        int i,j,r,k=1;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        i=0;
        while(i<=r)
        {
            j=1;
            while(j<=r-i){
                System.out.print(" ");
            j++;
            }
            j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
