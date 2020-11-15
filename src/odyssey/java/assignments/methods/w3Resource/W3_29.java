package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*
29. Write a C program to check whether a given number is an armstrong number or not. Go to the editor
Test Data :
Input a number: 153
Expected Output :
153 is an Armstrong number.
 */
public class W3_29 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        armstrong();
    }
    public static void armstrong(){
        int num,r,sum=0,temp;
        System.out.print("Input  a number: ");

        num = in.nextInt();
        temp=num;
        while(num!=0){
            r=num % 10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(sum==temp)
            System.out.print(temp+" is an Armstrong number.\n");
        else
            System.out.print(temp+" is not an Armstrong number.\n");
    }
}
