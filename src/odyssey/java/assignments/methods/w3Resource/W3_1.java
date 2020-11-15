package src.odyssey.java.assignments.methods.w3Resource;
public class W3_1 {
/*. Write a program in java to display the first 10 natural numbers. Go to the editor
Expected Output :
 1 2 3 4 5 6 7 8 9 10
*/
    public static void main(String args[]){
    one();
    }
    public static int one(){
        System.out.println("First ten natural numbers are : ");
        int i = 1;
        while ( i <= 10){
            System.out.print(i+" ");
            i++;
        }
        return i;
    }
}
