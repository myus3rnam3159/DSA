public class FlippingBits {
    public static long flippingBits(long n){
        return n ^ ((1L << 32) - 1);
    }
}
