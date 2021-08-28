class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = Integer.MIN_VALUE;
        
        for(int i = 0;  i < accounts.length;    i++){
            int currSum = 0;
            for(int j = 0;  j < accounts[i].length; j++){
                currSum = currSum + accounts[i][j];
            }
            if(currSum > maxWealth){
                maxWealth = currSum;
            }
        }
        
        return maxWealth;
    }
}
