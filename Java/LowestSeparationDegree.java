package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class Node implements Comparable<Node>{

    private String name;
    private int degreeOfSeparation;

    public Node(String name, int degreeOfSeparation){
        this.name = name;
        this.degreeOfSeparation = degreeOfSeparation;
    }

    public String getName(){
        return name;
    }

    public int getDegreeOfSeparation(){
        return degreeOfSeparation;
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(node.degreeOfSeparation, this.degreeOfSeparation);
    }
};

public class LowestSeparationDegree{

    private static PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();
    private static String[] connections = {"fred:tony", "mary:john", "bill:mary", "robert:fred", "john:robert", "tony:robert"};

    private static String name1 = "fred";
    private static String name2 = "bill";
    public static void main(String[] args){


        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String connection : connections){

            String[] names = connection.split(":");

            if(!map.containsKey(names[0])){
                map.put(names[0], new ArrayList<String>());
            }

            if(!map.containsKey(names[1])){
                map.put(names[1], new ArrayList<String>());
            }

            map.get(names[0]).add(names[1]);
            map.get(names[1]).add(names[0]);
        }

        Set<String> visited = new HashSet<String>();

        priorityQueue.add(new Node(name1, 0));
        while(!priorityQueue.isEmpty() && !priorityQueue.peek().getName().equals(name2) ){

            Node temp = priorityQueue.poll();
            
            for(String n: map.get(temp.getName())){
                if(!visited.contains(n)){
                    priorityQueue.add(new Node(n, temp.getDegreeOfSeparation() + 1));
                }
            }
            visited.add(temp.getName());
        }
        System.out.println(priorityQueue.size() == 1 ? priorityQueue.poll().getDegreeOfSeparation() : 0);
    };
}