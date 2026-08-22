class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            arr[0]+=nums[i];
            if(arr[0] == 0){
                arr[1] += 1;
            }
        }
        return arr[1];
    }
}