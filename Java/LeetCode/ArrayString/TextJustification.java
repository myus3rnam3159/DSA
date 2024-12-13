package ArrayString;

import java.util.ArrayList;
import java.util.List;

class TextJustification {
    List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();

        List<String> line = new ArrayList<String>(); 
        int length = 0;

        int i = 0;
        while(i < words.length){

            if(length + line.size() + words[i].length() > maxWidth) {
                int extraSpace = maxWidth - length;

                int spaces = extraSpace / Math.max(1, line.size() - 1);
                int remainder = extraSpace % Math.max(1, line.size() - 1);

                for(int j = 0; j < Math.max(1, line.size() - 1); ++j) {
                   line.set(j, line.get(j) + " ".repeat(spaces));

                   if(remainder > 0) {
                       line.set(j, line.get(j) + " ");

                       --remainder;
                   }
                }
                res.add(String.join("", line));
                line.clear();

                length = 0;
            }
            line.add(words[i]);
            length += words[i].length();
            ++i;
        }
        String lastLine = String.join(" ", line);
        int trailSpace = maxWidth - lastLine.length();
        res.add(lastLine + " ".repeat(trailSpace));

        return res;

    }
}