package Java;
import java.util.*;
import java.math.BigDecimal;

public class BigDecimals{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        SortedMap<BigDecimal, ArrayList<String>> bDMap = new TreeMap<BigDecimal, ArrayList<String>>(Comparator.reverseOrder());
        for(int i = 0; i < n; ++i){

            BigDecimal bD = new BigDecimal(s[i]);
          
            if(bDMap.containsKey(new BigDecimal(s[i]))){
                bDMap.get(bD).add(s[i]);
            } 
            else {
                ArrayList<String> bDList = new ArrayList<String>();
                bDList.add(s[i]);
                bDMap.put(bD, bDList);
            }
        }

        s = bDMap.values().stream().flatMap(ArrayList::stream).toArray(String[]::new);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }


}
