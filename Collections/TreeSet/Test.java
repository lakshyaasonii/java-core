package Collections.TreeSet;
import java.util.*;
public class Test {
    public static void main(String args[]){
        /*Treeset = HashSet + sorted order*/
        /*slow than hashset and linkedhashset*/
        Set<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(30) + " " + set.contains(50));
    }
}
