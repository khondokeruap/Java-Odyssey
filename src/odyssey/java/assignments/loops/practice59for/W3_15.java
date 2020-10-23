package src.odyssey.java.assignments.loops.practice59for;
/*
Write a Java program to calculate the factorial of a given number. Go to the editor
Test Data :
Input the number : 5
Expected Output :
The Factorial of 5 is: 120

 */
import java.util.Scanner;
public class W3_15 {
    public static void main(String[] args){
int i,f=1, n;

        System.out.println("Please print the number you want to do factorial: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=1;i<=n;i++)
            f=f*i;
        System.out.println("The factorial of " + n + " is "+f);



    }

}
