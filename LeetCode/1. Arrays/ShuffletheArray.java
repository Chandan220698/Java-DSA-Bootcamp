class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] returnArr = new int[nums.length];
        int k = 0;
        for(int i = 0, j = nums.length/2;  i < nums.length/2;  i++, j++){
            returnArr[k] = nums[i];
            returnArr[k+1] = nums[j];
            k += 2;
        }
        
        return returnArr;
    }
}
