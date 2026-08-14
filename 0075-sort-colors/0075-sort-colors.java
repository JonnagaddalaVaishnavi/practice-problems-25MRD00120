class Solution {
    public void sortColors(int[] nums) {
        int s = 0,m = 0, e  = nums.length - 1;
        while(m<=e){
            switch(nums[m]){
                case 0: swap(nums,s,m);
                        s++;
                        m++;
                        break;
                case 1: m++;
                        break;
                case 2: swap(nums,m,e);
                        e--;
                        break;
            }
        }
    }

    private void swap(int[] nums, int pos1,int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}