package Java;

import java.util.Scanner;

public class StringIntroduction {
   public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

         System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        
        StringBuilder stringBuilder = new StringBuilder(A);
        stringBuilder.setCharAt(0, Character.toUpperCase(A.charAt(0)));
        
        System.out.print(stringBuilder.toString()+" ");
        
        stringBuilder = new StringBuilder(B);
        
        stringBuilder.setCharAt(0, Character.toUpperCase(B.charAt(0)));
        System.out.print(stringBuilder.toString());
        
        sc.close();
   } 
}
