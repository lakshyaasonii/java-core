package Collections.ArrayList;
import java.util.*;
public class Test04 {
    public static void main(String args[]){
        //Array ko list me convert krna
        Integer array[] = {2,4,6,8,10};
        List<Integer> list = Arrays.asList(array);
        /*is list ka size change nhi kr skte hum log...isme add(), remove() method kaam nhi krega....but hum log set() kr skte hai*/
        System.out.println(list);
        list.set(1,3);
        System.out.printf("element at first index is: %d", list.get(1));
    }
}
