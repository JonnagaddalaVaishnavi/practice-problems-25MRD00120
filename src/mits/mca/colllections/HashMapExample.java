package mits.mca.colllections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        int arr[] = {10,10,20,10,40,50,70,50};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
