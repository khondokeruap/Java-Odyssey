package src.odyssey.java.assignments.loops.practice59while;

import java.util.Scanner;

/*
59. Write a program in C to check Armstrong number of n digits. Go to the editor
Test Data :
Input an integer : 1634
Expected Output :
1634 is an Armstrong number
 */
public class W3_59 {
    public static void main(String[] args){
        int n1, onum, r, result = 0, n = 0 ;
        System.out.print("Input  an integer : ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();

        onum = n1;

        while (onum != 0)
        {
            onum /= 10;
            ++n;
        }
        onum = n1;
        while (onum != 0)
        {
            r = onum % 10;
            result += Math.pow(r, n);
            onum /= 10;
        }
        if(result == n1)
            System.out.print(n1+ " is an Armstrong number.");
        else
            System.out.print(n1+" is not an Armstrong number.");
    }
}
