package ArrayString;

public class ZigZagConversion {
    public String convert(String s, int numRows){
        if(numRows == 1) return s;

        StringBuilder builder = new StringBuilder();
        int increment = 2 * (numRows - 1);

        for(int r = 0; r < numRows; ++r){
            for(int i = r; i < s.length(); i += increment) {

                builder.append(s.charAt(i));
                if(r > 0 && r < numRows - 1 && i + increment - 2 * r < s.length()){
                    builder.append(s.charAt(i + increment - 2 * r));
                }
            }
        }
        return builder.toString();
    }
}
