package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*50. Write a program in C to convert a decimal number into octal without using an array. Go to the editor
Test Data :
Enter a number to convert : 79
Expected Output :
The Octal of 79 is 117.
 */
public class W3_50 {
    public static void main(String[] args){
        int n, i, j, ocno=0,dn;
        System.out.print("Enter a number to convert : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dn=n;
        i=1;
        j=n;
        while (j>0)
        {
            ocno=ocno+(j % 8)*i;
            i=i*10;
            n=n/8;
        j=j/8;
        }
        System.out.print("\nThe Octal of "+dn+" is :"+ocno);
    }
}
