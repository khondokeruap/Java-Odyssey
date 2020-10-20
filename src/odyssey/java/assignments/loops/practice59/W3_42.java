package src.odyssey.java.assignments.loops.practice59;
import java.util.Scanner;
/*42. Write a program in C to convert a binary number into a decimal number without using array, function and while loop. Go to the editor
Test Data :
Input a binary number :1010101
Expected Output :
The Binary Number : 1010101
The equivalent Decimal Number : 85
 */
public class W3_42 {
    public static void main(String[] args){
        int n1, n,p=1;
        int dec=0,i=1,j,d;
        System.out.print("Input a binary number :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        n1=n;
        for (j=n;j>0;j=j/10)
        {
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*2;

            dec=dec+(d*p);
            i++;
        }
        System.out.println("\nThe Binary Number is :"+n1+"\nThe equivalent Decimal Number : "+dec);

    }
}
