package Java.Codility;

import java.util.Scanner;

public class SmallestBiggesstChildSubstring {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();
        sc.close();

        int biggestCharIndexFromLeft = 0;
        for(int i = 1; i < inStr.length(); ++i){
            if(inStr.charAt(i) < inStr.charAt(biggestCharIndexFromLeft)){
                break;
            }
            biggestCharIndexFromLeft = i;
        }

        StringBuilder strBuilder = new StringBuilder(inStr);
        System.out.println(strBuilder.deleteCharAt(biggestCharIndexFromLeft).toString());
    }
}
