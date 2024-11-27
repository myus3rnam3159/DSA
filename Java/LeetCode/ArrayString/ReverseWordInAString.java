package ArrayString;

import java.util.Deque;
import java.util.LinkedList;
import java.util.StringJoiner;

public class ReverseWordInAString {
    public String reverseWords(String s) {

        StringJoiner joiner = new StringJoiner(" ");
        Deque<String> deque = new LinkedList<>();
        
        int start = 0; int end = start;

        while(end < s.length()) {
            if(s.charAt(end) != ' ') {
                ++end;
                continue;
            }
            if(start != end) {
                deque.addLast(s.substring(start, end));
            }
            start = ++end;
        }
        if(s.charAt(end - 1) != ' ') {
            deque.addLast(s.substring(start, end));
        }

        while(deque.size() > 0) {
            joiner.add(deque.removeLast());
        }

        return joiner.toString();    
    }
}
