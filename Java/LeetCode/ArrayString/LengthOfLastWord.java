package ArrayString;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int start = s.length() - 1;
        int end = start;
        while(end >= 0){
            if(s.charAt(end) != ' '){
                
            }
            else{
                if(end + 1 < s.length() && s.charAt(end + 1) != ' ') break;
                end -= 1;
                start = end;
                continue;
            }

            end -= 1;
        }
        return start - end;
    }
}
