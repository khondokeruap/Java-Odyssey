package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*47. Write a C program to check whether a number is a Strong Number or not. Go to the editor
Test Data :
Input a number to check whether it is Strong number: 15
Expected Output :
15 is not a Strong number.

 */
public class W3_47 {
    public static void main(String[] args){
        int i, n, n1, s1=0,j;
        long fact;
        /* If sum of factorial of digits is equal to original number then it is Strong number */

        System.out.print("Input a number to check whether it is Strong number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        n1 = n;

        for(j=n;j>0;j=j/10)
        {

            fact = 1;
            for(i=1; i<=j % 10; i++)
            {
                fact = fact * i;
            }
            s1 = (int) (s1 + fact);

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
