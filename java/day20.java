import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BubbleSort {
    public void swap(int indexA, int indexB, List<Integer> l) {
        Integer a = l.get(indexA);
        Integer b = l.get(indexB);
        l.set(indexA, b);
        l.set(indexB, a);
    }
    
    public void sort(List<Integer> l) {
        int numberOfSwaps = 0;
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size() - 1; j++) {
                if (l.get(j) > l.get(j+1)) {
                    swap(j, j+1, l);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: "+ l.get(0));
        System.out.println("Last Element: "+ l.get(l.size() - 1));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here

        BubbleSort sorter = new BubbleSort();
        sorter.sort(a);

        bufferedReader.close();
    }
}
