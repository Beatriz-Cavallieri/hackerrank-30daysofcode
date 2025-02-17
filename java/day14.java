import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    public Difference(int[] array) {
        this.elements = array;
    }
    
    public void computeDifference() {
        int min, max;
        min = this.elements[0];
        max = this.elements[0];
        
        for (int i = 1; i< this.elements.length; i++) {
            if (this.elements[i] > max) {
                max= this.elements[i];
            }
            if (this.elements[i] < min) {
                min = this.elements[i];
            }
        }
        this.maximumDifference = max - min;
    }
	// Add your code here

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}