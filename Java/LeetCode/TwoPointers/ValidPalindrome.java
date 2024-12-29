package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char c: arr){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
