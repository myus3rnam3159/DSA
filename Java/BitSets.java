package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.BitSet;

public class BitSets {
    private static Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet> ();
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int nBits = sc.nextInt();

        bitSets.put(1, new BitSet(nBits));
        bitSets.put(2, new BitSet(nBits));

        int nOps = sc.nextInt();

        while(nOps-- > 0){
            String op = sc.next();
            int set = sc.nextInt();
            int arg = sc.nextInt();

            switch(op){
                case "AND":
                    bitSets.get(set).and(bitSets.get(arg));
                    break;
                case "OR":
                    bitSets.get(set).or(bitSets.get(arg));
                    break;
                case "XOR":
                    bitSets.get(set).xor(bitSets.get(arg));
                    break;
                case "FLIP":
                    bitSets.get(set).flip(arg);
                    break;
                case "SET":
                    bitSets.get(set).set(arg);
                    break;
            }

            System.out.println(bitSets.get(1).cardinality() + " " + bitSets.get(2).cardinality());
        }
        sc.close();
    }
}
