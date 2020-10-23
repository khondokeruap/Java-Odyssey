package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*32. Write a C program to determine whether a given number is prime or not. Go to the editor
 Test Data :
Input a number: 13
Expected Output :
13 is a prime number.
 */
public class W3_32 {
    public static void main(String[] args){
        int num,i,ctr=0;
        System.out.print("Input  a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        i=2;
        while (i<=num/2){
            if(num % i==0){
                ctr++;
                break;
            }
        i++;
        }
        if(ctr==0 && num!= 1)
            System.out.print(num+" is a prime number.\n");
        else
            System.out.print(num+" is not a prime number");
    }
}
