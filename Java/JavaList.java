package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);
        final List<Integer> arrayList = new ArrayList<Integer>();

        int count = scanner.nextInt();
        while(count-- > 0){

            arrayList.add(scanner.nextInt());
        }

        count = scanner.nextInt();
        while(count-- > 0){

            String query = scanner.next();

            if(query.compareTo("Insert") == 0){

                int index = scanner.nextInt();
                int value = scanner.nextInt();

                arrayList.add(index, value);
                
                continue;
            }
            arrayList.remove(scanner.nextInt());
        }
        scanner.close();

        for(Integer num : arrayList){
            System.out.print(num + " ");
        }

    }
    
}
