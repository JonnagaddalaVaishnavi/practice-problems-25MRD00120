package mits.mca.colllections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        int arr[] ={2,33,5,10,2,0,21,0,0,5,10};

        for(int ele : arr){
          //  int ele = (int) num;
            if(hs.contains(ele)){
                hs1.add(ele);
            } else {
                hs.add(ele);
            }
        }
        System.out.println(hs);
        System.out.println(hs1);

    }
}
