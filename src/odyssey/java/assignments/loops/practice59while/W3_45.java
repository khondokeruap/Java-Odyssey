package src.odyssey.java.assignments.loops.practice59while;
import java.util.Scanner;

/*45. Write a program in C to find LCM of any two numbers. Go to the editor
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
 */
public class W3_45 {
    public static void main(String[] args){
        int i, n1, n2, max, lcm=1;
        System.out.print("Input 1st number for LCM: ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        System.out.print("Input 2nd number for LCM: ");
        n2 = in.nextInt();
        max = (n1>n2) ? n1 : n2;

        for(i=max;  ; i+=max)
        {
            if(i%n1==0 && i%n2==0)
            {
                lcm = i;
                break;
            }
        }
        System.out.print("LCM of "+n1+" and "+n2+" is: "+ lcm);
    }
}
