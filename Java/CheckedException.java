package Java;
import java.util.Scanner;

class MyCalculator {

    public static long power(int base, int exponent) throws Exception {

        if(base < 0 || exponent < 0) throw new Exception("n or p should not be negative.");

        if(base == 0 && exponent == base) throw new Exception("n and p should not be zero.");

        return (long) Math.pow(base, exponent);
    }
}

public class CheckedException {
    
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while(in.hasNextInt()){

        }
    }
}
