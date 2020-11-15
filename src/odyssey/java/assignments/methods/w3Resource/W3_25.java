package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*25. Write a program in C to display the n terms of square natural number and their sum. Go to the editor
1 4 9 16 ... n Terms
Test Data :
Input the number of terms : 5
Expected Output :
The square natural upto 5 terms are :1 4 9 16 25
The Sum of Square Natural Number upto 5 terms = 55

 */
public class W3_25 {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        square();
    }
    public static void square(){
    int i,n,sum=0;
        System.out.print("Input the number of terms : ");

        n = in.nextInt();
        System.out.print("\nThe square natural upto "+n+" terms are : ");
        i=1;
        while (i<=n)
        {
            System.out.print(" "+ i*i);
            sum+=i*i;
        i++;
        }
        System.out.print("\nThe Sum of Square Natural Number upto "+n+" terms = "+sum);
    }
}
