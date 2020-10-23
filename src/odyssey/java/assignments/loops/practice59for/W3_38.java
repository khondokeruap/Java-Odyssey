package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*38. Write a program in C to check whether a number is a palindrome or not. Go to the editor
Test Data :
Input a number: 121
Expected Output :
121 is a palindrome number.
 */
public class W3_38 {
    public static void main(String[] args){
        int num,r,sum=0,t;

        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for(t=num;num!=0;num=num/10){
            r=num % 10;
            sum=sum*10+r;
        }
        if(t==sum)
            System.out.print(t+" is a palindrome number.\n");
        else
            System.out.print(t+" is not a palindrome number.\n");
    }
}
