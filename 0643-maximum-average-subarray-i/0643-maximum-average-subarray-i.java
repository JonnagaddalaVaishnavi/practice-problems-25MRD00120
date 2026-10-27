class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0, sum = 0.0;
        for(int i =0;i<k; i++){
            sum+=nums[i];
        }
        avg = sum/k;
        
        for(int i=k;i<nums.length;i++){
            sum = sum-nums[i-k]+nums[i];
            double newAvg = sum/k;
            avg=Math.max(avg,newAvg);
        }

        return avg;
    }
}