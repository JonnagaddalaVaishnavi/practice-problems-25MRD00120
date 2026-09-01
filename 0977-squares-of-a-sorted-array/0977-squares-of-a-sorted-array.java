class Solution {
    public int[] sortedSquares(int[] nums) {
        // Result array to store squared values in sorted order
        int[] res = new int[nums.length];

        // 'index' points to the last position in result array
        int index = nums.length - 1;

        // Two pointers:
        // i → start of array
        // j → end of array
        int i = 0, j = nums.length - 1;

        // Process until both pointers cross
        while (i <= j) {
            // Square values at both ends
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];

            // Place the larger square at the current 'index' position
            if (leftSquare < rightSquare) {
                res[index] = rightSquare;
                j--; // move right pointer left
            } else {
                res[index] = leftSquare;
                i++; // move left pointer right
            }
            index--; // move result index backward
        }

        // Return the sorted squares array
        return res;
    }
}
