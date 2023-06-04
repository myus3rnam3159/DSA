public class XorString3 {
    public static String xorString(String s, String t){

        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); ++i){
            char newChar = s.charAt(i) == t.charAt(i) ? '0' : '1';
            result.append(newChar);
        }

        return result.toString();
    }
}
