package Java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class HourGlass implements Comparable<HourGlass>{
    private Integer top;
    private Integer middle;
    private Integer bottom;

    public HourGlass(Integer top, Integer middle, Integer bottom){
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    public int getSum(){
        return top + middle + bottom;
    }

    @Override
    public int compareTo(HourGlass hourGlass) {
        return Integer.compare(hourGlass.getSum(), this.getSum());
    }
}

class TwoDArray{
    private static PriorityQueue<HourGlass> priorityQueue = new PriorityQueue<HourGlass>();
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

        
        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                
                int top = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);

                int middle = arr.get(i + 1).get(j + 1);

                int bottom = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);


                HourGlass hourGlass = new HourGlass(top, middle, bottom);

                priorityQueue.add(hourGlass);
            }
        }

        System.out.print(priorityQueue.poll().getSum());
        
        sc.close();
    }
}