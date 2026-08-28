class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays:
        // a → last valid element in nums1
        // b → last element in nums2
        // index → last position in nums1 (total length m+n)
        int a = m - 1, b = n - 1, index = nums1.length - 1;

        // Merge elements from the back to avoid overwriting nums1's valid data
        while (a >= 0 && b >= 0) {
            if (nums1[a] >= nums2[b]) {
                // Place the larger element at the current index
                nums1[index] = nums1[a];
                a--;
            } else {
                nums1[index] = nums2[b];
                b--;
            }
            index--;
        }

        // If any elements remain in nums2, copy them into nums1
        // (No need to copy remaining nums1 elements since they are already in place)
        while (b >= 0) {
            nums1[index] = nums2[b];
            index--;
            b--;
        }
    }
}
