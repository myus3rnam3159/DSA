package ArrayString;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < strs[0].length(); ++i) {
            for(String s: strs){
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return builder.toString();
                }
            }
            builder.append(strs[0].charAt(i));
        }

        return builder.toString();
    }
}
