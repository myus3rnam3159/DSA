package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasyArrayList {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Short n = sc.nextShort();

        List<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(n);
        for(int i = 0; i < n; ++i){

            int d = sc.nextInt();
            matrix.add(new ArrayList<Integer>(d));

            for(int j = 0; j < d; ++j){
                matrix.get(i).add(sc.nextInt());
            }
        }

        Short q = sc.nextShort();
        for(int i = 0; i < q; ++i){

            Short x = sc.nextShort();
            int y = sc.nextInt();

            try{
                System.out.println(matrix.get(x - 1).get(y - 1));
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }

        }
        sc.close();
    }
}
