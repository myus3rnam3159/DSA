package ArrayString;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;

        for(int i = 0; i < haystack.length() + 1 - needle.length(); ++i) {
            if(haystack.substring(i, i + needle.length()).compareTo(needle) == 0) return i;
        }

        return - 1;
    }
}
