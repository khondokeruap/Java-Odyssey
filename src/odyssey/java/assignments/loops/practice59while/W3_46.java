package src.odyssey.java.assignments.loops.practice59while;

import java.util.Scanner;

/*46. Write a program in C to convert a binary number into a decimal number using math function. Go to the editor
Test Data :
Input the binary number :1010100
Expected Output :
The Binary Number : 1010100
The equivalent Decimal Number is : 84

 */
public class W3_46 {
    public static void main(String[] args){
        int n1, n;
        int dec=0,i=0,j,d;
        System.out.print("Input  the binary number :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        n1=n;
        while(n!=0)
        {  d = n % 10;
            dec= (int) (dec+d* Math.pow(2,i));
            n=n/10;
            i++;
        }
        System.out.print("The Binary Number : "+n1+"\nThe equivalent Decimal  Number is : "+dec);

    }
}
