package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;

/*
28. Write a c program to find the perfect numbers within a given number of range. Go to the editor
Test Data :
Input the starting range or number : 1
Input the ending range of number : 50
Expected Output :
The Perfect numbers within the given range : 6 28
 */
public class W3_28 {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args) { pNumber();}
    public static void pNumber(){
        int n,i,sum;
        int mn,mx;
        System.out.print("Input the starting range or number : ");
        Scanner in = new Scanner(System.in);
        mn = in.nextInt();
        System.out.print("Input the ending range of number : ");
        mx = in.nextInt();
        System.out.print("The Perfect numbers within the given range : ");
        n=mn;
        while(n<=mx){
            i=1;
            sum = 0;
            while(i<n){
                if(n%i==0)
                    sum=sum+i;
                i++;
            }
            if(sum==n)
                System.out.print(" "+n);
        n++;
        }
        System.out.print("\n");
    }
}
