import ArrayString.CustomStringBuilder;

public class Main {
    public static void main(String[] args){
        String[] words = {"abcdef", "ghiklmn", "opqrs"};

        CustomStringBuilder builder = new CustomStringBuilder();
        for(String w: words){
            builder.append(w);
        }

        System.out.println("Sentence from customed StringBuilder: " + builder.toString());
    }
}
