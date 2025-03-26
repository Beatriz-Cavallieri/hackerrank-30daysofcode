//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void notFound() {
        System.out.println("Not found");
    }
    
    public static void findPhoneNumber(String name, Map<String, Integer> phoneBook) {
        if (phoneBook.containsKey(name)) {
            System.out.println(name + "=" + phoneBook.get(name));
        } else {
            notFound();
        }
    }
    
    public static void main(String []argh){
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            findPhoneNumber(s, phoneBook);
        }
        in.close();
        
    }
}