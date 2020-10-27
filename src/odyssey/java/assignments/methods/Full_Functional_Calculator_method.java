package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Full_Functional_Calculator_method {
    static Scanner reader = new Scanner(System.in);
    public static void main(String args[]) {
        calculator();
    }

        public static void calculator(){
        int i = 1;
        int choice;
        do {
            System.out.println("\nPress 1 for Addition.\nPress 2 for Deletion.\nPress 3 for Multiplication.\nPress 4 for Division.\nPress 5 for Exit.");
            System.out.println("Please Enter Your Choice: ");
            choice = reader.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Welcome to Addition World!!!");
                    System.out.println("Please Enter 1st number: ");
                    int num1 = reader.nextInt();
                    System.out.println("Please Enter 2nd number: ");
                    int num2 = reader.nextInt();

                    addition(num1, num2);
                }
                break;
                case 2: {
                    System.out.println("Welcome to Deletion World!!!");
                    System.out.println("Please Enter 1st number: ");
                    int num3 = reader.nextInt();
                    System.out.println("Please Enter 2nd number: ");
                    int num4 = reader.nextInt();
                    deletion(num3, num4);
                }
                break;
                case 3: {
                    System.out.println("Welcome to Multiplication World!!!");
                    System.out.println("Please Enter 1st number: ");
                    int num5 = reader.nextInt();
                    System.out.println("Please Enter 2nd number: ");
                    int num6 = reader.nextInt();
                    multiplication(num5, num6);
                }
                break;
                case 4: {
                    System.out.println("Welcome to Division World!!!");
                    System.out.println("Please Enter 1st number: ");
                    int num7 = reader.nextInt();
                    System.out.println("Please Enter 2nd number: ");
                    int num8 = reader.nextInt();
                    division(num7,num8);
                }
                break;
                case 5:
                    System.out.println("Thank You for using the app!!!");
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice. Try Again");
            }
        } while (choice != 5);
    }

    public static void addition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result of the two number provided for addition is : " + result);
    }
    public static void deletion(int num3, int num4) {
        int result1 = num3 - num4;
        System.out.println("Result of the two number provided for Deletion : " + result1);
    }
    public static void multiplication(int num5, int num6){
        int result2 = num5 * num6;
        System.out.println("Result of the two number provided for Multiplication is : " + result2);

    }
    public static void division(int num7, int num8){
        int result3 = num7 / num8;
        System.out.println("Result of the two number provided for Division is : " + result3);

    }
}
