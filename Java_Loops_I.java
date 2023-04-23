/*Given an integer, N, print its first 10 multiples. Each multiple (N x i) (where 1 =< i =< 10 ) should be printed on a new line in the form: N x i = result.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=1;i<=10;i++)
       {
           System.out.println(n + " x "+i+" = "+i*n);
       }
    }
}
