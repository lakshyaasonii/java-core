package Collections.LinkedList;
import java.util.*;
public class Test {
    public static void main(String args[]){
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(0,1);
        System.out.println(list);
        System.out.println(list.contains(1));

    }

}
