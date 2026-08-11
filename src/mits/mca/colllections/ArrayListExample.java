package mits.mca.colllections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        Iterator it = list.iterator();
        while(it.hasNext()){
            int num = (int)it.next();
            if(num % 2 == 0){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
