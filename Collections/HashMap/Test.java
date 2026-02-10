package Collections.HashMap;
import java.util.*;
public class Test {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Lakshya");
        map.put(2,"Raunak");
        map.put(3,"Naitik");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println("All keys-->" + map.keySet());
        System.out.println(map.containsKey(2)+" "+map.containsValue("Aman"));
    }
}
