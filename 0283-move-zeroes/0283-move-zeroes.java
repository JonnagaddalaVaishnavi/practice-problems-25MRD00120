class Solution {
    public void moveZeroes(int[] nums) {
        // 'index' keeps track of the position where the next non-zero element should be placed
        int index = 0;

        // Traverse the entire array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Swap the current non-zero element with the element at 'index'
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                // Move 'index' forward to the next position
                index++;
            }
        }
    }
}
