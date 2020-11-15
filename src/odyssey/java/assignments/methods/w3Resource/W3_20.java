package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*
Write a program in C to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks. Go to the editor
   *
  ***
 *****
 */
public class W3_20 {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[]args) {
        pyramid4();
    }
    public static void pyramid4(){
        int i,j,r,k=1;
        System.out.print("Input number of rows : ");

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
