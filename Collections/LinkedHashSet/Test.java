package Collections.LinkedHashSet;
import java.util.*;
public class Test {
    public static void main(String args[]){
        /*Hashset jaisa hi hai bus isme order maintain rehta hau...hashset se thoda slow speed*/
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(2) + " " + set.contains(5));
    }
}
