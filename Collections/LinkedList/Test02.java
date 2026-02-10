package Collections.LinkedList;
import java.util.*;
public class Test02 {
    public static void main(String args[]){
        List<Integer> list = List.of(2,4,6,8,10);
        /*Ye list Linked list nhi hai balki ek immutuable list hai jisme ad(), remove() set() kuch bhi perform nhi ho skta bus read only hai*/
        System.out.println(list);
    }
}
