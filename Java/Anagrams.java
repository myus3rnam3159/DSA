package Java;
// import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

public class Anagrams {

//    private static boolean isAnagram(String a, String b){
//     if(a.length() != b.length()) return false;

//     Map<Character, Integer> map = new HashMap<Character, Integer>();
    
//     for(char c : a.toCharArray()){
//         Character lowCaseChar = Character.toLowerCase(c);
//         map.put(lowCaseChar, map.getOrDefault(lowCaseChar, 0) + 1);
//     }

//     for(char c : b.toCharArray()){
//         Character lowCaseChar = Character.toLowerCase(c);
//         if(!map.containsKey(lowCaseChar)) return false;
//         map.put(lowCaseChar, map.get(lowCaseChar) - 1);
//     }

//     for(int value : map.values()){
//         if(value != 0) return false;
//     }

//     return true;
//    }


//Not using Map
    private static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;

        int[] freq = new int[26];

        for(int i = 0; i < a.length(); ++i){
            freq[Character.toLowerCase(a.charAt(i)) - 'a']++;
            freq[Character.toLowerCase(b.charAt(i)) - 'a']--;
        }

        for(int i = 0; i < 26; ++i){
            if(freq[i] != 0) return false;
        }
        
        return true;
    }

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        sc.close();
        System.out.print( isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
   }

}
