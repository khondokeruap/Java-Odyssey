package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*49. Write a c program to find out the sum of an A.P. series. Go to the editor
Test Data :
Input the starting number of the A.P. series: 1
Input the number of items for the A.P. series: 10
Input the common difference of A.P. series: 4
Expected Output :
The Sum of the A.P. series are :
1 + 5 + 9 + 13 + 17 + 21 + 25 + 29 + 33 + 37 = 190
 */
public class W3_49 {
    public static void main(String[] args){
        int n1,df,n2,i,ln;
        int s1=0;
        System.out.print("Input  the starting number of the A.P. series: ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        System.out.print("Input the number of items for  the A.P. series: ");
        n2 = in.nextInt();

        System.out.print("Input  the common difference of A.P. series: ");
        df= in.nextInt();

        s1 = ( n2 * ( 2 * n1 + ( n2 -1 ) * df ) )/ 2;
        ln = n1 + (n2-1) * df;
        System.out.print("\nThe Sum of the  A.P. series are : \n");

        for(i=n1;i<=ln; i= i + df ){
            if (i != ln)
                System.out.print(i +" + ");
            else
                System.out.print(i + " = " + s1);
        }
    }
}
