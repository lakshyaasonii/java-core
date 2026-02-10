package Collections.LinkedList;
import java.util.*;
public class Test03 {
    public static void main(String args[]){
        //Coversion of array to list
        Integer array[] = {2,4,6,8,10};
        List<Integer> list = Arrays.asList(array);
        /*Ye list me add(), remove() nhi kr skte hum log but set() method use kr skte hai */
        System.out.println(list);
    }
}
