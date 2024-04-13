package Java.Codility;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class MinDaysToComplete{

    private static Map<Integer, LinkedList<Integer>> dayMissionMap = new HashMap<Integer, LinkedList<Integer>>();

    private static int currentDay = 0;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] missions = new int[n];

        while(n-- > 0){
            missions[n] = sc.nextInt();
        }
        sc.close();

       
        System.out.println("Smallest number of days to complete all missions: " + calMinDays(missions, x));
    }

    private static int calMinDays(int[] missions, int X){
        dayMissionMap.put(currentDay, new LinkedList<Integer>());

        for(int i = 0; i < missions.length; ++i){
            if(areAllSumWithSameDayMissionLesser(missions[i], X)){

                dayMissionMap.get(currentDay).add(missions[i]);
            }
            else{

                currentDay++;
                i--;
            }

        }
        return currentDay;
    }

    private static boolean areAllSumWithSameDayMissionLesser(int currentMissionDiff, int X){
        //current day must involve in
        if(dayMissionMap.containsKey(currentDay)){
            for(int difficulty: dayMissionMap.get(currentDay)){
                if(Math.abs(currentMissionDiff - difficulty) > X){
                    return false;
                }
            }
        }
        return true;
    }
}