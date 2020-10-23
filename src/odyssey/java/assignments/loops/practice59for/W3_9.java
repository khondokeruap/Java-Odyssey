package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;

/*9. Write a program in C to display the pattern like right angle triangle using an asterisk. Go to the editor
The pattern like :
*
**
***
****
 */
public class W3_9 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of row you want to print: ");
        int n=in.nextInt();
        for (int i=1;i<=n; i++){
           for (int j =1; j<=i;j++){
               System.out.print("*");
               }
       System.out.println("");
       }
        System.out.println("Thank you ");

        System.out.println("Please enter the number of row you want to print: ");
        n=in.nextInt();
        for (int i=1;i<=n; i++){
            for (int j =n; j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Thank you ");
    }

}
