package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*57. Write a program in C to print a string in reverse order. Go to the editor
Test Data :
Input a string to reverse : Welcome
Expected Output :
Reversed string is: emocleW
 */
public class W3_57 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse(){
        System.out.println("Input a string to reverse : ");
        String s = in.nextLine();

        char[] t = s.toCharArray();
        System.out.print("Reversed string is : ");

        for(int i = t.length - 1; i >=0;i--)
            System.out.print(t[i]);
        System.out.println("");
    }
}
