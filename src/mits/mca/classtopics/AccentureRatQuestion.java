package mits.mca.classtopics;
/*
(Asked in Accenture OnCampus 10 Aug 2022, Slot
Problem Description:
The function accepts two positive integers 'r' and 'unit' and a positive integer array 'arr' of size 'n' as its argument 'r' represents the number of rats present in an area, unit is
the amount of food each rat consumes and each ith element of array 'arr' represents the amount of food present in i+T' house number, where O
Note:
Return-1 if the array is null
Return O if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:
Input:
1.7
unit: 2
8 arr: 28357412
Explanation:
Total amount of food required for all rats runit
-7-2-14.
Output:
2 1
 */

import java.util.Scanner;

public class AccentureRatQuestion {

    static int ratQuestion(int r, int unit, int[] arr){
        //int n = arr.length;
        if(arr.length == 0) return -1;

        int totalFood = unit * r;
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
            if(sum >= totalFood ){  // return count;
                break;
            }
        }
        if(sum < totalFood) return 0;
        //return 0;
        return count;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the no.of rats: ");
        int r = scan.nextInt();
        System.out.println("Enter the food for each rat: ");
        int unit = scan.nextInt();
        System.out.println("Enter the array size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(ratQuestion(r,unit,arr));
    }
}