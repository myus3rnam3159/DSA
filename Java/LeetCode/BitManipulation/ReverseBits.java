package BitManipulation;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result <<= 1; // khi shift di chuyển theo hướng và đơn vị (ex - 1), ra khỏi khung thì cho mất luôn, lổ trống được lấp = 0
            result |= (n & 1); // khi and vơi giá trị cứng thì tưởng tượng số  không bên trái do giá trị nhỏ - ex: 1.
            n >>= 1;
        }
        return result;
    }
}
