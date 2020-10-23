package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*
37. Write a program in C to display the number in reverse order. Go to the editor
Test Data :
Input a number: 12345
Expected Output :
The number in reverse order is : 54321
 */
public class W3_37 {
    public static void main(String[] args){
        int num,r,sum=0,t;

        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        for(t=num;num!=0;num=num/10){
            r=num % 10;
            sum=sum*10+r;
        }
        System.out.print("The number in reverse order is : \n"+sum);
    }
}
