package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*10. Write a program in C to display the pattern like right angle triangle with a number. Go to the editor

The pattern like :
1
12
123
1234
 */
public class W3_10 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of row you want to print: ");
        int n=in.nextInt();
        int i=1;
        while(i<=n){
            for (int j =1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
            i++;
        }
        System.out.println("Thank you ");
    }
}
