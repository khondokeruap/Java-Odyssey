package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*53. Write a program in C to convert a binary number to octal. Go to the editor
Test Data :
Input a binary number :1001
Expected Output :
The Binary Number : 1001
The equivalent Octal Number : 11
 */
public class W3_53 {
    public static void main(String[] args){
        int n1, n,p=1;
        int dec=0,i=1,j,d;
        int ocno=0,dn;

        System.out.print("Input a binary number :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        n1=n;
        j=n;
        while (j>0)
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
        dn=dec;
        i=1;
        j=dec;
        while (j>0)
        {
            ocno=ocno+(j % 8)*i;
            i=i*10;
            n=n/8;
        j=j/8;
        }

        System.out.print("\nThe Binary Number : "+n1+ "\nThe equivalent Octal Number : "+ocno);

    }
}
