import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer i = 4;
        Double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        
        Integer secondInteger = Integer.parseInt(scan.nextLine()); 
        Double secondDouble = Double.parseDouble(scan.nextLine()); 
        String secondString = scan.nextLine();
        
        System.out.println(i + secondInteger);
        System.out.println(d + secondDouble);
        System.out.println(s + secondString);
    }
}