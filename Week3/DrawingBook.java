public class DrawingBook {
    public static int pageCount(int n, int p){
        int allFlips = n/2;
        int leftFlips = p/2;

        if(leftFlips > allFlips / 2){
            return allFlips - leftFlips;
        }
        return leftFlips;
    }
}
