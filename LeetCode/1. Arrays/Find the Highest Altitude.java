class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        int high = alt[0];
        
        for(int i = 1;  i < gain.length + 1;   i++){
            alt[i]  = alt[i-1] + gain[i-1];
            if(alt[i] > high){
                high = alt[i];
            }
        }
        return high;
    }
}
