package Collections.Comparator;
import java.util.*;
public class Ascending_sort {
    public static void main(String args[]){
        Comparator<Integer> comp01 = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a-b; //for ascending order sort
            }
        };
        Set<Integer> set = new TreeSet<>(comp01);
        set.add(30);
        set.add(20);
        set.add(10);
        System.out.println(set);
    }
}
