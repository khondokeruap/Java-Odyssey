package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*47. Write a C program to check whether a number is a Strong Number or not. Go to the editor
Test Data :
Input a number to check whether it is Strong number: 15
Expected Output :
15 is not a Strong number.
 */
public class W3_47 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        strongn();
    }
    public static void strongn(){
        int i, n, n1, s1=0,j;
        long fact;
        System.out.print("Input a number to check whether it is Strong number: ");
        n = in.nextInt();
        n1 = n;
        j=n;
        while (j>0)
        {
            fact = 1;
            for(i=1; i<=j % 10; i++)
            {
                fact = fact * i;
            }
            s1 = (int) (s1 + fact);
            j=j/10;
        }
        if(s1==n1)
        {
            System.out.print(n1+" is Strong number.");
        }
        else
        {
            System.out.print(n1+" is not Strong number.");
        }
    }
}
