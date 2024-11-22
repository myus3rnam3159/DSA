package ArrayString;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length();
        int length = 0;

        while(s.charAt(--i) == ' ') {}
        while(i >= 0 && s.charAt(i--) != ' ') {++length;}

        return length;
    }
}
