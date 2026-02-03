package String;

public class Test {
    public static void main(String args[]){
        String name = "Lakshya Soni";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        String str = name.toUpperCase();
        System.out.println(str);
        System.out.println(name);

        //String slicing
        String name01 = "Raunak Soni";
        String part = name01.substring(2,8);
        System.out.println(part);
        System.out.println(name01);
    }
}
