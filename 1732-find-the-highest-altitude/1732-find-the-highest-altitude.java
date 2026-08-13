class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        
        for(int i = 0 ; i < gain.length; i++){
            res[i+1] = gain[i]+res[i];
        }
        int maxAltitude = 0;
        for(int x : res){
            maxAltitude = Math.max(maxAltitude,x);
        }
        return maxAltitude;
    }
}