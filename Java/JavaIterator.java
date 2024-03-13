package Java;
import java.util.*;

public class JavaIterator {
    static Iterator func(ArrayList myList){

        Iterator it = myList.iterator();

        while(it.hasNext()){
            Object element = it.next();

            if(element instanceof String && element.equals("###"))
                
                break;{
            }
            return it;
        }
        return it;
    }
    @SuppressWarnings({"unchecked"})
    public static void main(String []args){

        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; ++i){
            myList.add(sc.nextInt());
        }

        for(int i = 0; i < m; ++i){
            myList.add(sc.next());
        }

        Iterator it = func(myList);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
