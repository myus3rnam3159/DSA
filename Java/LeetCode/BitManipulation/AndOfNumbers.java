package BitManipulation;

public class AndOfNumbers {
    int rangeBitwiseAnd(int left, int right) {
        while (right > left) {
            right &= right - 1;
        }
        return right;
    }
}
