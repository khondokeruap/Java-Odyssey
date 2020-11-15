package src.odyssey.java.assignments.methods.w3Resource;

/*
39. Write a program in C to find the number and sum of all integer between 100 and 200 which are divisible by 9. Go to the editor
Expected Output :
Numbers between 100 and 200, divisible by 9 :
108 117 126 135 144 153 162 171 180 189 198
The sum : 1683
 */
public class W3_39 {

    public static void main(String[] args){

        {
            int i, sum=0;
            System.out.print("Numbers between 100 and 200, divisible by 9 : \n");
            i=101;
            while (i<200)
            {
                if(i%9==0)
                {
                    System.out.print(" "+i);
                    sum+=i;
                }
            i++;
            }
            System.out.print("\nThe sum : "+sum);
    }
}}
