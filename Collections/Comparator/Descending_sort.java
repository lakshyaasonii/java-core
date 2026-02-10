package Collections.Comparator;
import java.util.*;
public class Descending_sort {
    public static void main(String args[]){
        Comparator<Integer> comp02 = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b-a; //for descending order sort
            }
        };
        Set<Integer> set = new TreeSet<>(comp02);
        set.add(30);
        set.add(20);
        set.add(10);
        System.out.println(set);
    }
}
