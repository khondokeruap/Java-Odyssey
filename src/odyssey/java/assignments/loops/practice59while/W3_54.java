package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*54. Write a program in C to convert an octal number into binary. Go to the editor
Test Data :
Input an octal number (using digit 0 - 7) :57
Expected Output :
The Octal Number : 57
The equivalent Binary Number : 101111
 */
public class W3_54 {
    public static void main(String[] args){
        long  n1, n5,p=1;
        long  dec=0,i=1,j,d;
        long  binno=0;

        System.out.print("Input an octal number (using digit 0 - 7) :");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n5=n1;
        j=n1;
        while (j>0)
        {
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*8;

            dec=dec+(d*p);
            i++;
        j=j/10;
        }

        i=1;
        j=dec;
        while (j>0)
        {
            binno=binno+(dec % 2)*i;
            i=i*10;
            dec=dec/2;
        j=j/2;
        }

        System.out.print("\nThe Octal Number : "+n5+"\nThe equivalent Binary  Number : "+binno);

    }
}
