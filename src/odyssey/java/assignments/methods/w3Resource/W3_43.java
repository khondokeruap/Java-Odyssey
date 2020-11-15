package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*43. Write a C program to find HCF (Highest Common Factor) of two numbers. Go to the editor
Test Data :
Input 1st number for HCF: 24
Input 2nd number for HCF: 28
Expected Output :
HCF of 24 and 28 is : 4
 */
public class W3_43 {
static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        hcf();
    }
    public static void hcf(){
        int i, n1, n2, j, hcf=1;
        System.out.print("Input 1st number for HCF: ");

        n1 = in.nextInt();
        System.out.print("Input 2nd number for HCF: ");
        n2 = in.nextInt();

        j = (n1<n2) ? n1 : n2;
        i=1;
        while ( i<=j)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf = i;
            }
        i++;
        }
        System.out.print("HCF of "+n1+" and "+n2+" is : "+ hcf);
    }
}