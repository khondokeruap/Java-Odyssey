package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
public class W3_2{
static Scanner in = new Scanner (System.in);
/*
2. Write a JAVA program to find the sum of first 10 natural numbers. Go to the editor
Expected Output :
The first 10 natural number is :
1 2 3 4 5 6 7 8 9 10
The Sum is : 55
*/
public static void main(String args[]){
    natural();
    }
public static void natural(){
System.out.println("Please enter the number :");
    int n = in.nextInt(), c, t = 0;
    c=1;
        while(c <= n){
        t = t + c;
        c++;
    }
        System.out.println("Sum of first " + n + " natural numbers is: "+t);
}
}