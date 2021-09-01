class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};
        
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        
        return ans;
    }
    
    public int search(int[] nums, int target, boolean searching_start_index){
        
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                // return mid;
                ans = mid;   // Possible ans
                // Check if we want to switch the search for first index or end index
                if(searching_start_index){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        
        return ans;
        
    }
}
