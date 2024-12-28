import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        payment = Math.round(payment*100.0)/100.0;
        
        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inFormate = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        
        NumberFormat chinaFormate = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat franceFomate = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + inFormate.format(payment));
        System.out.println("China: " + chinaFormate.format(payment));
        System.out.println("France: " + franceFomate.format(payment));
    }
}
