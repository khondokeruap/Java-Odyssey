package src.odyssey.java.assignments.loops.practice59for;
/*
7. Write a program in C to display the multipliaction table vertically from 1 to n. Go to the editor
Test Data :
Input upto the table number starting from 1 : 8
Expected Output :
Multiplication table from 1 to 8
1x1 = 1, 2x1 = 2, 3x1 = 3, 4x1 = 4, 5x1 = 5, 6x1 = 6, 7x1 = 7, 8x1 = 8
...
1x10 = 10, 2x10 = 20, 3x10 = 30, 4x10 = 40, 5x10 = 50, 6x10 = 60, 7x10 = 70, 8x10 = 80

 */
import java.util.Scanner;

public class W3_7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int j,i,n;
        System.out.println("Input up to the table number starting from 1 : ");
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        System.out.println("Multiplication table from 1 to " +n+ " is: ");
        i=1;
        while (i<=n)
        {
            for(j=1;j<=10;j++)
            {
                if (j<=n-1)
                    System.out.println(i+ "x" + j + "="+ i*j);
                else
                    System.out.println(i+ "x" + j + "="+ i*j);
            }
            System.out.println("\n");
            i++;
        }
        System.out.println("Thank you for using the app");
    }
}
