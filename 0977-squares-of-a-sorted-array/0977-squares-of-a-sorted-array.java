class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int index = nums.length -1;
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];
            if(leftSquare < rightSquare){
                res[index] = rightSquare;
                j--;
            } else {
                res[index] = leftSquare;
                i++;
            }
            index--;
        }
        return res;
    }
}