package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*56. Write a program in C to Check Whether a Number can be Express as Sum of Two Prime Numbers. Go to the editor
Test Data :
Input a positive integer: 16
Expected Output :
16 = 3 + 13
16 = 5 + 11
 */
public class W3_56 {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        sum2();
    }
    public static void sum2(){
        int num,i,j,temp1,temp2,ctr=0;
        System.out.print("input the number:\n");

        num = in.nextInt();
        i=2;
        while (i<=num/2){
            temp1=i;
            temp2=num-i;
            for(j=2;j<=i/2;j++){
                if(i%j==0){ctr++;break;}
            }
            if(ctr==0){
                for(j=2;j<=(num-i)/2;j++){
                    if((num-i)%j==0){ctr++;break;}
                }
                if(ctr==0)
                    System.out.print("\n "+num+" = "  +i+" + "+(num-i));
            }
            ctr=0;
        i++;
        }
    }
}
