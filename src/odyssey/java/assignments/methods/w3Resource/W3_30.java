package src.odyssey.java.assignments.methods.w3Resource;
import java.util.Scanner;
/*
30. Write a C program to find the Armstrong number for a given range of number. Go to the editor
Test Data :
Input starting number of range: 1
Input ending number of range : 1000
Expected Output :
Armstrong numbers in given range are: 1 153 370 371 407
 */
public class W3_30 {
static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        armstrongRange();
    }
    public static void armstrongRange(){
        int num,r,sum,temp;
        int stno,enno;
        System.out.print("Input starting number of range: ");
        stno = in.nextInt();
        System.out.print("Input ending number of range : ");
        enno = in.nextInt();
        System.out.print("Armstrong numbers in given range are: ");
        num=stno;
        while(num<=enno){
            temp=num;
            sum = 0;
            while(temp!=0){
                r=temp % 10;
                temp=temp/10;
                sum=sum+(r*r*r);
            }
            if(sum==num)
                System.out.print(" "+num);
        num++;
        }
        System.out.print("\n");
    }
}
