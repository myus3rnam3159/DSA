package Java;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
    
        int[] array = new int[size];
        for(int i = 0; i < size; ++i){
            array[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i = 0; i < size; ++i){
            int sum = 0;
            for(int j = i; j < size; ++j){
                sum += array[j];
                if(sum < 0) count++;
            }
        }
        sc.close();
        System.out.print(count);
    }
}
