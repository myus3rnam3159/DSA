package ArrayString;

public class IntToRoman {
    public String intToRoman(int num) {

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length; ++i) {

            if(num / value[i] > 0) {
                int count = num / value[i];
                sb.append(String.valueOf(roman[i]).repeat(count));
                num = num % value[i];
            }
        }
        return sb.toString();
    }
}
