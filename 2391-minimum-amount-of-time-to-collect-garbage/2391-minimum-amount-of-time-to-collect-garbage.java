class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
     int totalTravelTime = 0;
     int lastPaper = 0,lastGlass = 0, lastMetal = 0;
     int paperTravel = 0, glassTravel = 0, metalTravel = 0;
     for(int i = 0; i < garbage.length; i++) {
        totalTravelTime += garbage[i].length();

        for(char ch : garbage[i].toCharArray()){
            if(ch == 'P'){
                lastPaper = i;
            } else if(ch == 'G'){
                lastGlass = i;
            } else if(ch == 'M'){
                lastMetal = i;
            }
        }
     }
     for(int i = 1; i <= lastPaper ; i++) {
            paperTravel += travel[i-1];
        }

        for(int i = 1;i <= lastGlass ; i++){
            glassTravel += travel[i-1];
        }

        for(int i = 1; i <= lastMetal ; i++) {
            metalTravel += travel[i-1];
        }
        return totalTravelTime + paperTravel + glassTravel + metalTravel;
    }
}