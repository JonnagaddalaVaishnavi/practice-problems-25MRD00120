package mits.mca.classtopics;

import java.util.Scanner;

public class SwapArrayElements {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       /*
       System.out.println("Enter array size: ");
       int n = scan.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i < arr.length ; i++){
           arr[i]=scan.nextInt();
       }
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
        System.out.println(sum);
        */
       int[] res = swapArrayElement();
       for(int x=0; x<res.length;x++){
           System.out.println(res[x]);
       }
    }

    static int[] swapArrayElement(){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] res = new int[arr.length];
        int ans=0;
        for(int j = 0; j < arr.length ; j++){
            ans = arr[j]+ans;
            res[j] = ans ;
        }
        return res;
    }
}
