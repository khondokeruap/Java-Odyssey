package src.odyssey.java.assignments.loops.practice59;
import java.util.Scanner;
import java.lang.Math;

/*
52. Write a program in c to find the Sum of GP series. Go to the editor
Test Data :
Input the first number of the G.P. series: 3
Input the number or terms in the G.P. series: 5
Input the common ratio of G.P. series: 2
Expected Output :
The numbers for the G.P. series:
3.000000 6.000000 12.000000 24.000000 48.000000
The Sum of the G.P. series : 93.000000

 */
public class W3_52 {
    public static void main(String[] args){
        float g1,cr,i,n,j;
        float ntrm,gpn;
        float sum=0;

        System.out.print("Input the first number of the G.P. series: ");
        Scanner in = new Scanner(System.in);
        g1 = in.nextInt();

        System.out.print("Input the number or terms in the G.P. series: ");
        ntrm = in.nextInt();

        System.out.print("Input the common ratio of G.P. series: ");
        cr = in.nextInt();

        System.out.println("\nThe numbers for the G.P. series: ");
        System.out.print(g1+"00000 ");
        sum=g1;

        for(j=1;j<ntrm;j++)
        {
            gpn= (float) (g1*Math.pow(cr,j));
            sum=sum+gpn;
            System.out.print(gpn+ "00000 ");
        }
        System.out.println("\nThe Sum of the G.P. series : "+sum);


    }
}
