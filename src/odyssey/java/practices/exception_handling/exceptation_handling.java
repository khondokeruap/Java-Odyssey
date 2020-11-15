package src.odyssey.java.practices.exception_handling;

import java.util.Scanner;

public class exceptation_handling {
    public static void main(String[] args) {
        int x=1;
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("enter fitst number: ");
                int n1 = in.nextInt();
                System.out.println("enter second number: ");
                int n2 = in.nextInt();
                int result = n1 / n2;
                System.out.println("The result is " + result);
                x=2;
            } catch (Exception e) {
                System.out.println("Wrong input! Please revise your input. ");
            }
        }while (x == 1);
    }
}
