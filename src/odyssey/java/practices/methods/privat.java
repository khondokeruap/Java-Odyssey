package src.odyssey.java.practices.methods;

import java.util.Scanner;

public class privat {
    public static void main(String[] args) {
    dog();
    }
public static void dog(){
    Scanner in = new Scanner(System.in);
    int i, j, rows, s, k, t=1;

    rows = 4;
    s = rows ;
        for(i=1;i<=rows;i++){
        for(k=s;k>=1;k--){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print(" " + t++);
        }
        System.out.println("");
        s--;
    }
        }
    }
