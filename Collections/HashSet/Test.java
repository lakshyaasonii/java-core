package Collections.HashSet;
import java.util.*;
public class Test {
    public static void main(String args[]){
        /*Hashset me duplicate elements allow nhi hote aur na hi elements me indexing hoti hai..isme order fix nhi hai*/
        Set <Integer> set = new HashSet<>(); //Set me indexing nhi hoti hai isiliye get aur set methid yha kaam nhi krta..uske liye iteration use krte hai
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); //duplicate element delete kr dega
        System.out.println(set);
        System.out.println(set.size());//ite tells us about the size of the set(Same as list)
        System.out.println(set.contains(20) + " " + set.contains(40));
    }
}
