package src.odyssey.java.assignments.arrays.w3School;
/*
6. Write a Java program to find the index of an array element.
 */
public class W3array_6 {
    public static void main(String[] args) {
        int[] my_array = {456,6554,3334,799,849,644,4};
        System.out.println("Index of 6554 is: " + findIndex(my_array, 6554));
        System.out.println("Index of 4 is: " + findIndex(my_array, 4));
    }
    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
}
