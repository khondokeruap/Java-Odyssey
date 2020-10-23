package src.odyssey.java.assignments.loops.practice59while;
/*19. Write a program in JAVA to display the n terms of harmonic series and their sum. Go to the editor
1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
Test Data :
Input the number of terms : 5
Expected Output :
1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
Sum of Series upto 5 terms : 2.283334
 */
import java.util.Scanner;
public class W3_19 {
    public static void main (String[]args){
        int i,n;
        float s= (float) 0.0;
        System.out.println("Input the number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        i=1;
        while(i<=n) {
            if (i < n) {
                System.out.print("1/"+i+ " + ");
                s += 1 / (float) i;
            }
            if (i == n) {
                System.out.println("1/"+i+ " + ");
                s += 1 / (float) i;
                System.out.println("Sum of Series upto "+n+" terms : " + s);
            }
        i++;
        }

    }
}

