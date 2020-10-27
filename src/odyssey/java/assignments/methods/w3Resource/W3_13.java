package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*13. Write a program in C to make such a pattern like a pyramid with numbers increased by 1. Go to the editor
   1
  2 3
 4 5 6
7 8 9 10
 */
public class W3_13 {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[]args) {
        pyramid1();
    }
    public static void pyramid1(){
        int i, j, rows, s, k, t=1;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();
        s = rows ;
        i=1;
        while(i<=rows){

            for(k=s;k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(" " + t++);
            }
            System.out.println("");
            s--;
            i++;
        }
    }
}

