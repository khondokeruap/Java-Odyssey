package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*42. Write a program in C to convert a binary number into a decimal number without using array, function and while loop. Go to the editor
Test Data :
Input a binary number :1010101
Expected Output :
The Binary Number : 1010101
The equivalent Decimal Number : 85
 */
public class W3_42 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        decimal();
    }
    public static void decimal(){
        int n1, n,p=1;
        int dec=0,i=1,j,d;
        System.out.print("Input a binary number :");
        n = in.nextInt();
        n1=n;
        j=n;
        while  (j>0)
        {
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*2;

            dec=dec+(d*p);
            i++;
            j=j/10;
        }
        System.out.println("\nThe Binary Number is :"+n1+"\nThe equivalent Decimal Number : "+dec);

    }
}
