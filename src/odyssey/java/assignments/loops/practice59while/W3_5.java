package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*5. Write a program in C to display the cube of the number upto given an integer. Go to the editor
Test Data :
Input number of terms : 5
Expected Output :
Number is : 1 and cube of the 1 is :1
Number is : 2 and cube of the 2 is :8
Number is : 3 and cube of the 3 is :27
Number is : 4 and cube of the 4 is :64
Number is : 5 and cube of the 5 is :125
 */
public class W3_5 {
    public static void main(String []args){
        int i,n;
        System.out.println("Input the number of term : ");
        Scanner reader =new Scanner(System.in);
        n = reader.nextInt();
        i=1;
        while ( i <=n){
            System.out.println( "Number is : " + i + " and cube of the number " + i + " is: " + (i*i*i));
            i++;
        }
    }
}
