package ArrayString;

public class HIndex {
    public int hIndex(int[] citations) {
        int[] temp = new int[citations.length + 1];

        for (int c : citations) {
            if (c > citations.length - 1) {
                ++temp[citations.length];
            }
            else {
                ++temp[c];
            }
        }


        int i = temp.length;
        int cites = temp[i-1];

        while(--i > 0) {
            if(i <= cites) return i;
            cites += temp[i-1];
        }
        return i;

    }
}
