package Java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;



class TwoDArray{
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> arr = new ArrayList<List<Integer>>();


        IntStream.range(0, 6)
            .forEach(
                i -> {
                    arr.add(
                        Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
                    );
                }
            );

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                
                int top = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);

                int middle = arr.get(i + 1).get(j + 1);

                int bottom = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                max = Math.max(max, top + middle + bottom);
            }
        }

        System.out.print(max);
        
        sc.close();
    }
}