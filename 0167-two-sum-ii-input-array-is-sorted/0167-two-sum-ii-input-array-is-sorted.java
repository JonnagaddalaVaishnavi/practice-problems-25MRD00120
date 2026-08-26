class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Initialize two pointers:
        // i starts from the beginning, j starts from the end of the array
        int i = 0, j = numbers.length - 1;

        // Continue until the two pointers meet
        while (i < j) {
            // Calculate the sum of the two current elements
            int sum = numbers[i] + numbers[j];

            // If the sum matches the target, return the 1-based indices
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }

            // If the sum is greater than the target,
            // move the right pointer left to reduce the sum
            if (sum > target) {
                j--;
            } else {
                // If the sum is less than the target,
                // move the left pointer right to increase the sum
                i++;
            }
        }

        // This return is technically redundant since the problem
        // but included for completeness
        return new int[]{i + 1, j + 1};
    }
}