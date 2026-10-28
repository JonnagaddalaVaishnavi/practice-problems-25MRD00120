class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> occurrence = new HashMap<>();

        for(int i=0;i<=nums.length-1;i++) {
            if(occurrence.containsKey(nums[i])){
                int index = occurrence.get(nums[i]);
                int distance = i - index;
                if(distance<=k){
                    return true;
                }
            } 
            occurrence.put(nums[i],i);
        }
        return false;
    }
}