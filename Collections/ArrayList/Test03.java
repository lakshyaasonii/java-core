package Collections.ArrayList;
import java.util.*;
public class Test03 {
    public static void main(String args[]){
        //List from another collection...(kisi aur collection se list banana)
        List<Integer> list01 = List.of(2,4,6,8,10); //fixed list (immutuable)
        List<Integer> list = new ArrayList<>(list01);
        System.out.println(list);
        list.add(12);
        list.add(14);
        list.add(16);
        System.out.println(list);
    }
}
