class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        for(int i = 0 ; i<= gain.length ; i++){
            int alt =0;
            for(int j = 0; j < i; j++){
                alt += gain[j];
            }
            max = Math.max(alt,max);
        }
        return max;
    }
}