import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n > 3) {
            for (int i = 2; i <= n/2; i++) {
                if (n%i == 0){
                    return false;
                }
            }   
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while (cases-- > 0) {
            int number = sc.nextInt();
            if (isPrime(number)){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}