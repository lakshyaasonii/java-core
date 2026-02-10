package Collections.Iterator;
import java.util.*;
public class Test {

    public static void main(String args[]){
        /*Iterator ek object hai jo collection ke element ko ek ek krke acces lrta hai(better than loop)*/
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int x = it.next();
            System.out.println(x + " ");
        }
    }
}
