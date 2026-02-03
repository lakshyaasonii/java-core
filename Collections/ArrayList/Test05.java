package Collections.ArrayList;
import java.util.*;

public class Test05 {
    public static void main(String args[]){
        Integer array[] = {2,4,6,8,10}; //array
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        //ab is list me add(), remove(), set() sb kuch kr skte ho....
        System.out.println(list);

        list.add(12);
        list.add(14);
        list.add(16);
        System.out.println(list);
    }
}
