package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*
29. Write a C program to check whether a given number is an armstrong number or not. Go to the editor
Test Data :
Input a number: 153
Expected Output :
153 is an Armstrong number.
 */

public class W3_29 {
    public static void main(String[] args){
        int num,r,sum=0,temp;

        System.out.print("Input  a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        for(temp=num;num!=0;num=num/10){
            r=num % 10;
            sum=sum+(r*r*r);
        }
        if(sum==temp)
            System.out.print(temp+" is an Armstrong number.\n");
        else
            System.out.print(temp+" is not an Armstrong number.\n");
    }
}
