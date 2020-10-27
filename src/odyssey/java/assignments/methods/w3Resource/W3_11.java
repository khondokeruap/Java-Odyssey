package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*11. Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row. Go to the editor

The pattern like :

 1
 22
 333
 4444
 */
public class W3_11 {
    static Scanner in = new Scanner(System.in);
    public static void main (String[]args) {
        rNumber();
    }
    public static void rNumber(){
        System.out.println("Please enter the number of row you want to print: ");
        int n=in.nextInt();
        int i=1;
        while(i<=n){
            for (int j =1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        i++;
        }
        System.out.println("Thank you using the app ");
    }
}
