package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*55. Write a program in C to convert a decimal number to hexadecimal. Go to the editor
Test Data :
Input any Decimal number: 79
Expected Output :
The equivalent Hexadecimal Number : 4F
 */
public class W3_55 {
    public static void main(String[] args){
        long decn,rmd,q,dn=0,m,l;
        int i=1,j,tmp;
        char s;

        System.out.print("Input  any Decimal number: ");
        Scanner in = new Scanner(System.in);
        decn = in.nextInt();
        q = decn;
        l=q;
        while (l>0)
        {
            tmp = (int) (l % 16);
            if( tmp < 10)
                tmp =tmp + 48; else
                tmp = tmp + 55;
            dn=dn*100+tmp;
        l=l/16;
        }
        System.out.print("\nThe equivalent Hexadecimal Number : ");
        m=dn;
        while (m>0)
        {
            s= (char) (m % 100);
            System.out.print(s);
        m=m/100;
        }
        System.out.print("\n\n");

    }
}
