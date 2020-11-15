package src.odyssey.java.practices.map;

public class eight {
    public static void main(String[] args) {
        Summation(6);
    }

    public static int Summation(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return n + Summation(n - 1);
        }
    }

}
