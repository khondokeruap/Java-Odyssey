package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*38. Write a program in C to check whether a number is a palindrome or not. Go to the editor
Test Data :
Input a number: 121
Expected Output :
121 is a palindrome number.
 */
public class W3_38 {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
            palindrome();
        }
        public static void palindrome(){
        int num,r,sum=0,t;
        System.out.print("Input a number: ");
        num = in.nextInt();
        t=num;
        while (num!=0){
            r=num % 10;
            sum=sum*10+r;
        num=num/10;
        }
        if(t==sum)
            System.out.print(t+" is a palindrome number.\n");
        else
            System.out.print(t+" is not a palindrome number.\n");
    }
}
