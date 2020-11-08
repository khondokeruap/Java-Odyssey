package src.odyssey.java.practices.arrays;

public class GetAndSetArrey {

        public static void main(String[] args) {
            for(int i=0; i<createArray().length;i++){
                System.out.println("[" + i +"] == " + createArray()[i]);
            }
        }
        public static int[] createArray(){
            int numbers[]= {10,20,30,40,50};
            return numbers;
        }
    }

