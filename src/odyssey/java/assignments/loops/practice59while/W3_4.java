package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*4. Write a program in C to read 10 numbers from keyboard and find their sum and average. Go to the editor
Test Data :
Input the 10 numbers :
Number-1 :2
...
Number-10 :2
Expected Output :
The sum of 10 no is : 55
The Average is : 5.500000
 */
public class W3_4 {
    public static void main (String []args){
        int i,n=0,s=0;
        double avg;
        {

            System.out.println("Input the 10 numbers : ");

        }
        i=0;
        while (i<10)
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s +=n;
            i++;
        }
        avg= s/10.00;
        System.out.println("The sum of 10 no is : " +s+"\nThe Average is : " +avg);
    }
}

