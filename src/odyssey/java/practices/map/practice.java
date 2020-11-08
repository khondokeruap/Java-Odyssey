package src.odyssey.java.practices.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice {

       static Scanner reader=new Scanner(System.in);
        public static void main(String []args){
            Map<String, Integer> phoneBook = new HashMap<String, Integer>();

            Scanner in = new Scanner(System.in);
//            System.out.println("Please type how many name you want to add in the phone book:");
            int n = in.nextInt();
            for(int i = 0; i < n; i++) {
                String kame = in.next();
                Integer phone = in.nextInt();
                phoneBook.put(kame, phone);
//              System.out.println(phoneBook.keySet());     // To print out key
//              System.out.println(phoneBook.values());     // To print out values
//              System.out.println(phoneBook.entrySet());   // To print out key and values
            }
                while(in.hasNext()){
                    String s = in.next();

                    if (phoneBook.get(s)!=null)
                        System.out.println(s + "=" + phoneBook.get(s) );
                    else
                        System.out.println("Not found");

                }in.close();


        }


}
