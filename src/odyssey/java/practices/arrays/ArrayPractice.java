package src.odyssey.java.practices.arrays;
import java.util.Scanner;
public class ArrayPractice {
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args){

        System.out.println("Please enter how many times you want to store data: ");
        int n= in.nextInt();
        String names[]= new String [n];
        in.nextLine();
        for(int i=0;i<names.length;i++){
            System.out.println("Please enter your name: ");
            names [i]= in.nextLine();
        }

        for(int i=0;i<names.length;i++) {
            System.out.println("Name ["+i+"]: "+names[i].toUpperCase());
        }

    }
}
