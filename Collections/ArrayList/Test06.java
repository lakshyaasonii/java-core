package Collections.ArrayList;
import java.util.*;
public class Test06 {
    public static void main(String args[]){
        /*conversion of list into an Array(List ko array banana)*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //conversion
        Integer array[] = list.toArray(new Integer[0]); //array
        for(int element: array){
            System.out.print(element + " ");
        }

    }
}
