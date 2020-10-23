package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*44. Write a program in C to find LCM of any two numbers using HCF. Go to the editor
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
 */
public class W3_44{
        public static void main(String[] args) {
                int i, n1, n2, j, hcf = 1, lcm;

                System.out.print("Input 1st number for LCM: ");
                Scanner in = new Scanner(System.in);
                n1 = in.nextInt();
                System.out.print("Input 2nd number for LCM: ");
                n2 = in.nextInt();

                j = (n1 < n2) ? n1 : n2;
                i = 1;
                while ( i <= j) {

                        if (n1 % i == 0 && n2 % i == 0) {
                                hcf = i;
                        }
                i++;
                }
                lcm = (n1 * n2) / hcf;

                System.out.print("The LCM of " +n1+ "and " +n2+" is : " + lcm);

        }
}
