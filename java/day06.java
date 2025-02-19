import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printOddEven(String word) {
        String odd = "";
        String even = "";
        
        char[] arr = word.toCharArray();
        
        even += arr[0];
        for(int i = 1; i < word.length(); i++){
            if (i%2 ==0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
}
        
        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        
        Integer N = Integer.parseInt(scan.nextLine());
        
        String[] arr = new String[N];
        
        for (int i = 0; i < N; i++){
            arr[i] = scan.nextLine();   
        }

        for (int i = 0; i < N; i++) {
            printOddEven(arr[i]);
        }
        
        
        scan.close();
    }
}


