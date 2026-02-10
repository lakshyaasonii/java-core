package Collections.HashMap;
import java.util.*;
public class KeySet {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Lakshya");
        map.put(2,"Raunak");
        map.put(3,"Naitik");
        for(Integer e: map.keySet()){
            System.out.println("key -->" + e + " Value of key-->" +map.get(e));
        }
    }
}
