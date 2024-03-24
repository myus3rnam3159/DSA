package Java;

import java.util.HashMap;
import java.util.Scanner;

public class LargestUniqueCharSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> map = new HashMap<>();
        int maxStrlen = 0;
        int start = 0;
        int maxStrStart = 0;

        for(int end = 0; end < str.length(); end++){
            char endChar = str.charAt(end);
            if(map.containsKey(endChar)){
                start = Math.max(map.get(endChar) + 1, start);
            }
            map.put(endChar, end);
            if(maxStrlen < end - start + 1){
                maxStrlen = end - start + 1;
                maxStrStart = start;
            }
        }

        String largestStr = str.substring(maxStrStart, maxStrStart + maxStrlen);
        System.out.println(str + "=" + largestStr);
    }
}