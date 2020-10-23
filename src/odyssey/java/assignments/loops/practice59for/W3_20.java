package src.odyssey.java.assignments.loops.practice59for;
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
        for(i=0;i<=r;i++)
        {
            for(j=1;j<=r-i;j++){
                System.out.print(" ");}
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");}
            System.out.print("\n");
        }
    }
}
