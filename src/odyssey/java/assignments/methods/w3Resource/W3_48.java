package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*48. Write a C program to find Strong Numbers within a range of numbers. Go to the editor
Test Data :
Input starting range of number : 1
Input ending range of number: 200
Expected Output :
The Strong numbers are :
1 2 145
 */
public class W3_48 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        strong1();
    }
    public static void strong1(){
        int i, n, n1, s1=0,j,k,en,sn;
        long fact;
        System.out.print("Input starting range of number : ");

        sn = in.nextInt();

        System.out.print("Input ending range of number: ");
        en = in.nextInt();
        System.out.println("The Strong numbers are :");
        k=sn;
        while (k<=en)
        {
            n1=k;
            s1=0;

            for(j=k;j>0;j=j/10)
            {

                fact = 1;
                for(i=1; i<=j % 10; i++)
                {
                    fact = fact * i;
                }
                s1 = (int) (s1 + fact);
            }

            if(s1==n1)

                System.out.print(" "+n1);
            k++;
        }
    }
}
