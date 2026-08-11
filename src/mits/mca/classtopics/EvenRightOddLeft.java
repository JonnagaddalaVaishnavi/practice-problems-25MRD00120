package mits.mca.classtopics;

import java.util.Arrays;
import java.util.Scanner;

public class EvenRightOddLeft {
    static int[] swapEvenAndOdd(int[] arr){
        int i=0,j= arr.length - 1;
        while(i<j){
            if(arr[i]%2 == 0){
                i++;
            } else if(arr[j]%2 != 0){
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        int[] res = swapEvenAndOdd(arr);
        /*
        for(int x=0; x<res.length;x++){
            System.out.println(res[x]);
        }
         */
        System.out.println(Arrays.toString(res));
    }
}
