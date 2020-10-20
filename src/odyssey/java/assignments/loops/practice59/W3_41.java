package src.odyssey.java.assignments.loops.practice59;
import java.util.Scanner;
/*41. Write a program in C to convert a decimal number into binary without using an array. Go to the editor
Test Data :
Enter a number to convert : 25
Expected Output :
The Binary of 25 is 11001.
 */
public class W3_41 {
    public static void main(String[] args){
        int n, i, j, binno=0;
        System.out.print("Enter a number to convert : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i=1;
        for(j=n;j>0;j=j/2)
        {
            binno=binno+(n%2)*i;
            i=i*10;
            n=n/2;
        }
        System.out.print("The Binary of the given number is : "+binno);
    }
}
