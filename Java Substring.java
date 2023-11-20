import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        subsequent(S,start,end);
    }
     public static void subsequent(String s,int Start,int end){
        for (int i = Start; i < end; i++) {
            System.out.print(s.charAt(i));
        }
    }
}
