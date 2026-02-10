package Collections.Comparator;
import java.util.*;
public class Ascending_sort_lambda {
    public static void main(String args[]){
        Comparator<Integer> comp = (a,b) -> a-b; //LAMBDA VERSION
        Set<Integer> set = new TreeSet<>(comp);
        set.add(30);
        set.add(20);
        set.add(10);
        System.out.println(set);
    }
}
