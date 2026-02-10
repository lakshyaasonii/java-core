package Collections.LinkedList;
import java.util.*;
public class Test04 {
    public static void main(String args[]){
        //conversion of array to list
        Integer array[] = {2,5,8,9,-1};
        List<Integer> list01 = Arrays.asList(array); //fixed list
        List<Integer> list = new LinkedList<>(list01);
        /*This list is mutuable --isme saare operation perform kr skte hai*/
        System.out.println(list);
        list.set(4,11);
        System.out.println(list);
    }
}
