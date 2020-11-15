package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*58. Write a C program to find the length of a string without using the library function. Go to the editor
Test Data :
Input a string : welcome
Expected Output :
The string contains 7 number of characters.
So, the length of the string welcome is : 7

 */
public class W3_58 {
static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            library();
        }
        public static void library(){
        int count = 0;
        String str;
        System.out.println("Input a string : ");
        str = sc.nextLine();
        char ch[] = str.toCharArray();

        for (char c : ch){
            count++;
        }
        System.out.println("The string contains " + count + " number of characters. ");
        System.out.println("So, the length of the string " + str + " is : " + count + ".");
    }
}
