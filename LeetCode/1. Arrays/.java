class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0;
        int j = 0;
      
        for(i = 0;  i < nums.length-1;  i++){
            int sum = 0;
            for(j = i + 1;  j < nums.length;  j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    // return new int[]{i, j}; return here not working
                    break;
                }
            }
            if(sum == target){
                break;
            }
        }
        return new int[] {i, j};    // Returning the array
        
    }
}
