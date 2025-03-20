import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
            
        LocalDate returnDate = LocalDate.of(year, month, day);
            
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
            
        LocalDate dueDate = LocalDate.of(year, month, day);
        
        sc.close();
            
        int fine = calculateFine(returnDate, dueDate);
        
        System.out.print(fine);
    }
    
    public static int calculateFine (LocalDate returnDate, LocalDate dueDate) {
        if (returnDate.isAfter(dueDate)) {             
            if (returnDate.getYear() > dueDate.getYear()) {
                return 10000;
            }
            if (returnDate.getMonthValue() > dueDate.getMonthValue()) {
                int monthsLate = returnDate.getMonthValue() - dueDate.getMonthValue();
                return 500*monthsLate;
            }
            
            int daysLate = returnDate.getDayOfMonth() - dueDate.getDayOfMonth();
            if (daysLate > 0) {
                return 15*daysLate;
            }
        }      
        return 0;
    }
}

