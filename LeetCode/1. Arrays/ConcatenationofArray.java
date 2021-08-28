class Solution {
    public int[] getConcatenation(int[] nums) {
         
        int[] ans = new int[2*nums.length];
           // Brute Force Approch
        
//         int n = nums.length;
//         for(int i = 0;  i < 2*(n);   i++){
            
//             int temp = 0;
//             if(i > n - 1){
//                 temp = n;
//             }
//             ans[i] = nums[i - temp];
//         }
        
        // Optimised
        
        for(int i = 0, j = nums.length;   i < nums.length;  i++, j++){
            
            ans[i] = nums[i];
            ans[j] = nums[i];
            
        }
        return ans;
    }
}
