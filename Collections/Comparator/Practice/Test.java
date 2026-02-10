package Collections.Comparator.Practice;
import java.util.*;
public class Test {
    public static void main(String args[]){
        Comparator<Student> comp = new Comparator<>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o2.marks - o1.marks;
            }
        };
        Set<Student> set = new TreeSet<>(comp);
        set.add(new Student("Lakshya Soni",70));
        set.add(new Student("Manish Soni",80));
        set.add(new Student("Raunak Soni",60));
        System.out.println(set);
    }
}
