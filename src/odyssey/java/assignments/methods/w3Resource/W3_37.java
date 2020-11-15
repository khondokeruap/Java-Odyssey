package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*
37. Write a program in C to display the number in reverse order. Go to the editor
Test Data :
Input a number: 12345
Expected Output :
The number in reverse order is : 54321
 */
public class W3_37 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse(){
        int num,r,sum=0,t;

        System.out.print("Input a number: ");

        num = in.nextInt();
        t=num;
        while(num!=0){
            r=num % 10;
            sum=sum*10+r;
        num=num/10;
        }
        System.out.print("The number in reverse order is : \n"+sum);
    }
}
