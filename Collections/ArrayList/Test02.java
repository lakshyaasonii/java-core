package Collections.ArrayList;

import java.util.*;

public class Test02 {
    public static void main(String args[]){
       List<Integer> list = List.of(2,4,6,8,10);
       // is tarah ki list me add remove set kuch perform nhi kr kste bus get kr skte hai ..readonly list
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
