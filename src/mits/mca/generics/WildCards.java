package mits.mca.generics;


import java.util.Arrays;
import java.util.List;

public class WildCards {

    //wildcard
    static void display(List<?> list){
        System.out.println(list);
    }

    static void disp(List<? extends Number> li){
        Integer a = 10;
        Number num = 20;
        System.out.println(li);
    }
    static void disp1(List<? extends Integer> li){
        Integer a = 10;
        Number num = 20;
        System.out.println(li);
    }

    public static void main(String[] args) {
        display(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        display(Arrays.asList('a','b','c','d','e','f'));
        /*
        disp(Arrays.asList(1,2,3,4,5,6,7,8,9));
        disp(Arrays.asList('a','b','c','d','e','f','g','h','i'));

        disp1(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        disp1(Arrays.asList(1.0,2.2,3.2));

         */
    }
}
