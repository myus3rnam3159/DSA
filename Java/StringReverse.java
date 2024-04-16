package Java;

import java.util.Scanner;

public class StringReverse{
    private static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n/2; ++i){
            if(str.charAt(i) != str.charAt(n - i -1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        System.out.print(isPalindrome(A) ? "Yes" : "No");
    }
}