package ArrayString;

import java.util.ArrayList;

public class CustomStringBuilder {
    private ArrayList<String> array;
    public String toString(){
        String sentence = "";
        for (String s : array)
            sentence += s;
        return sentence;
    }
    public void append(String str){
        this.array.add(str);
    }

    public CustomStringBuilder() {
        this.array = new ArrayList<>();
    }
    
}