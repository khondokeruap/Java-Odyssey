package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*9. Write a program in C to display the pattern like right angle triangle using an asterisk. Go to the editor
The pattern like :
*
**
***
****
 */
public class W3_9 {
    static Scanner in = new Scanner(System.in);
    public static void main (String[]args) {
        rtriangle();

    }
    public static void rtriangle(){
        System.out.println("Please enter the number of row you want to print: ");
        int n=in.nextInt();
        int i=1;
        while (i<=n){
           for (int j =1; j<=i;j++){
               System.out.print("*");
               }
       System.out.println("");
           i++;
       }
        System.out.println("Thank you for using the app");
    }

}
