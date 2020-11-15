package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*41. Write a program in C to convert a decimal number into binary without using an array. Go to the editor
Test Data :
Enter a number to convert : 25
Expected Output :
The Binary of 25 is 11001.
 */
public class W3_41 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        binary();
    }
    public static void binary(){
        int n, i, j, binno=0;
        System.out.print("Enter a number to convert : ");

        n = in.nextInt();
        i=1;
        j=n;
        while (j>0)
        {
            binno=binno+(n%2)*i;
            i=i*10;
            n=n/2;
            j=j/2;
        }
        System.out.print("The Binary of the given number is : "+binno);
    }
}
