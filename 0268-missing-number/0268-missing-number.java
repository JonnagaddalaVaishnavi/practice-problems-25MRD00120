class Solution {
    public int missingNumber(int[] nums) {
        int allXor = 0;
        //XOR over the elements from [0-n]
        for(int i = 0; i<= nums.length; i++){
            allXor = allXor ^ i;
        }

        //XOR over the array elements with the allXor
        for(int x : nums){
            allXor = allXor ^ x;
        }
        return allXor;
    }
}