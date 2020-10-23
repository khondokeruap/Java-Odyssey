package src.odyssey.java.assignments.loops.practice59for;
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
        for(i=2;i<=num/2;i++){
            if(num % i==0){
                ctr++;
                break;
            }
        }
        if(ctr==0 && num!= 1)
            System.out.print(num+" is a prime number.\n");
        else
            System.out.print(num+" is not a prime number");
    }
}
