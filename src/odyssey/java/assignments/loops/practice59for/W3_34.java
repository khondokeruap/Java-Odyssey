package src.odyssey.java.assignments.loops.practice59for;
import java.util.Scanner;
/*34. Write a program in C to find the prime numbers within a range of numbers. Go to the editor
Test Data :
Input starting number of range: 1
Input ending number of range : 50
Expected Output :
The prime number between 1 and 50 are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

 */
public class W3_34 {
    public static void main(String[] args){
        int num,i,ctr,stno,enno;

        System.out.print("Input starting number of range: ");
        Scanner in = new Scanner(System.in);
        stno = in.nextInt();
        System.out.print("Input ending number of range : ");
        enno= in.nextInt();
        System.out.println("The prime numbers between "+stno+" and "+enno+" are :");

        for(num = stno;num<=enno;num++)
        {
            ctr = 0;
            for(i=2;i<=num/2;i++)
            {
                if(num%i==0){
                    ctr++;
                    break;
                }
            }
            if(ctr==0 && num!= 1)
                System.out.print(" "+num);
        }
        System.out.print("\n");
    }
}
