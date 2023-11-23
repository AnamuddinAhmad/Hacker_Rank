import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
         String[] myList = s.split("[^a-zA-Z0-9]+");

    if (s.length() == 0) {
        System.out.println(0);
    } else {
        System.out.println(myList.length);
        for (String x: myList) {
            System.out.println(x);
        }
    }
        scan.close();
    }
}
