package Collections.ArrayList;

import java.util.*;

public class Test {
    public static void main(String args[]){
        List<Integer> list01 = new ArrayList<>();
        list01.add(1); //method to add element in list
        list01.add(2);
        list01.add(3);
        System.out.print(list01); //method to print whole list
        System.out.println(); //space
        System.out.println(list01.get(1)); //.get() method is used to get element from any index of a list

        System.out.println(list01.getClass().getName());
    }
}
