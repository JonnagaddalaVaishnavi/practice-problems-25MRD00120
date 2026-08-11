package mits.mca.classtopics;

public class LargestSumInSubarray {

    static int kadansAlgorithm(int[] arr){
        int sum = 0, maxSum=0;
        for(int i = 0; i<arr.length ; i++){
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }

    //T.C = n cube
    static int largestSumInSubArray(int[] arr){
        int sum=0, max=Integer.MIN_VALUE;
        for(int size = 1; size<arr.length ; size++){
            for(int i=0;i<arr.length - size ; i++){
                for(int j=i;j<i+size;j++){
                    sum+=arr[j];
                }
                max=Math.max(sum,max);
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largestSumInSubArray(arr));
    }
}
