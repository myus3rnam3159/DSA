package Java;
import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex = "<([^<>]+)>([^<>]+)</\\1>";
        Pattern p = Pattern.compile(regex);

        while (testCases > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);
            boolean found = false;
            while (m.find()) {
                if (m.group(2).length() != 0) {
                    System.out.println(m.group(2).trim());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("None");
            }
            testCases--;
        }
        in.close();
    }
}


