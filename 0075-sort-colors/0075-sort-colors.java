class Solution {
    public void sortColors(int[] nums) {
        // Three pointers:
        // s → boundary for 0s (start)
        // m → current element being checked (middle)
        // e → boundary for 2s (end)
        int s = 0, m = 0, e = nums.length - 1;

        // Process elements until m crosses e
        while (m <= e) {
            switch (nums[m]) {
                case 0:
                    // If current element is 0:
                    // Swap it to the front (position 's')
                    swap(nums, s, m);
                    // Move both s and m forward
                    s++;
                    m++;
                    break;

                case 1:
                    // If current element is 1:
                    // Leave it in place and just move m forward
                    m++;
                    break;

                case 2:
                    // If current element is 2:
                    // Swap it to the end (position 'e')
                    swap(nums, m, e);
                    // Decrease e (end boundary moves left)
                    // Do NOT increase m here because the swapped element at m needs to be checked
                    e--;
                    break;
            }
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
