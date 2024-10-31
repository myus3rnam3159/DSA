package ArrayString;

import java.util.LinkedList;
import java.util.ArrayList;

class Node {
    private String key;
    private Object value;

    public Node(String key, Object value){
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return this.key;
    }

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}

public class CustomHashTable {
    private ArrayList<LinkedList<Node>> array;
    public int hash(String key) {
        int sum = 0;
        for (char c: key.toCharArray()){
            sum += c;
        }
        return sum;
    }

    public int map(int hashedKey) {
        return hashedKey % array.size();
    }

    public CustomHashTable(int size) {
        this.array = new ArrayList<>();
    }

    public void put(Node node) {
        

        if(this.array.isEmpty()){
            LinkedList<Node> newList = new LinkedList<>();
            newList.add(node);
            this.array.add(newList);
            return;
        }

        int hashKey = this.hash(node.getKey());
        int index = this.map(hashKey);

        LinkedList<Node> list = this.array.get(index);
        for(Node n : list){
            if(n.getKey().equals(node.getKey())){
                n.setValue(node.getValue());
                return;
            }
        }
        list.add(node);

    }

}
