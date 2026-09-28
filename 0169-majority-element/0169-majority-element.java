class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int value : nums){
            int updatedValue = hs.getOrDefault(value,0)+1;
            hs.put(value,updatedValue);

            if(updatedValue > n){
                return value;
            }
        }
        return -1;
    }
}