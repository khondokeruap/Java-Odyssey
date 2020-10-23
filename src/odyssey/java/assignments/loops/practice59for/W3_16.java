package src.odyssey.java.assignments.loops.practice59for;
/*
16. Write a program in java to display the n terms of even natural number and their sum. Go to the editor
Test Data :
Input number of terms : 5
Expected Output :
The even numbers are :2 4 6 8 10
The Sum of even Natural Number upto 5 terms : 30

 */
import java.util.Scanner;
public class W3_16 {
    public static void main(String[] args){
        int i,n,sum=0;
        Scanner in = new Scanner (System.in);
        System.out.println("Input number of terms : ");
        n =in.nextInt();
        System.out.print("The even numbers are : ");
        for (i=1;i<=n;i++){
            System.out.print(2*i+" ");
            sum +=2*i;
        }
          System.out.println("\nThe Sum of even Natural Number upto " +n+" terms : "+sum);
    }
}
