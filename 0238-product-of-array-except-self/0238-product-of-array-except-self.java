class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Build prefix products (left side)
        // result[i] will store product of all elements before index i
        result[0] = 1; // nothing before first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products (right side)
        // Use a single variable to track product of elements after index i
        int rightProduct = 1; // nothing after last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return result;
    }
}
