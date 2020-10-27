package src.odyssey.java.assignments.methods.w3Resource;

import java.util.Scanner;

/*6. Write a program in C to display the multiplication table of a given integer. Go to the editor
Test Data :
Input the number (Table to be calculated) : 15
Expected Output :
15 X 1 = 15
...
...
15 X 10 = 150
 */
public class W3_6 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        multiplication();
    }
    public static void multiplication(){
        System.out.println("Please type which table to be calculated ");
        int n = in.nextInt();
        int i = 1;
        while ( i <= 10 ) {
            System.out.println(n + " X " + i + " = " + (n * i));
            i++;
        }
        System.out.println("Thank you for using the app");
    }
}
