class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Arrays to store cumulative products from left and right sides
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // Step 1: Build the "left product" array
        // left[i] = product of all elements before index i
        left[0] = 1; // nothing before the first element
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
            // Example: left[2] = nums[0] * nums[1]
        }

        // Step 2: Build the "right product" array
        // right[i] = product of all elements after index i
        right[nums.length - 1] = 1; // nothing after the last element
        for (int j = nums.length - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
            // Example: right[2] = nums[3] * nums[4] * ... till end
        }

        // Step 3: Final result
        // For each index i, result[i] = product of all elements except nums[i]
        // This is done by multiplying left[i] * right[i]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }

        // Return the modified nums array as the result
        return nums;
    }
}
