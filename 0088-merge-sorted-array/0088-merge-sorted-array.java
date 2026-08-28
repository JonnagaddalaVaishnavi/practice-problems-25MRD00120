class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a temporary result array to hold merged elements
        int[] res = new int[m + n];

        // i → pointer for nums1
        // j → pointer for nums2
        // index → pointer for res (merged array)
        int i = 0, j = 0, index = 0;

        // Merge elements while both arrays still have elements left
        while (i != m && j != n) {
            if (nums1[i] <= nums2[j]) {
                res[index] = nums1[i];
                i++;
            } else {
                res[index] = nums2[j];
                j++;
            }
            index++;
        }

        // Copy remaining elements from nums1 (if any)
        while (i < m) {
            res[index] = nums1[i];
            index++;
            i++;
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            res[index] = nums2[j];
            index++;
            j++;
        }

        // Copy merged result back into nums1
        for (int x = 0; x < res.length; x++) {
            nums1[x] = res[x];
        }
    }
}
