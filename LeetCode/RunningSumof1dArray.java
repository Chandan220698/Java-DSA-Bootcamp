class Solution {
    public int[] runningSum(int[] nums) {
        
        //int runSum = nums[0];
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        
        for(int i = 1;  i < nums.length;    i++){
            runningSum[i] = nums[i] + runningSum[i - 1];
        }
        return runningSum;
    }
}
