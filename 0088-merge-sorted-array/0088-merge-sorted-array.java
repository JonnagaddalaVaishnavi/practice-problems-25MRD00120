class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i = 0, j = 0, index=0;
        while(i != m && j != n){
            if(nums1[i] <= nums2[j]){
                res[index] = nums1[i];
                i++;
            }
            else {
                res[index] = nums2[j];
                j++;
            }
            index++;
        }
        while(i<m){
            res[index] = nums1[i];
            index++;
            i++;
        }

        while(j<n){
            res[index] = nums2[j];
            index++;
            j++;
        }
        for(int x = 0 ; x < res.length ; x++){
            nums1[x] = res[x];
        }
    }
}