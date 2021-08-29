class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int i = 0;  i < nums.length;    i++){
            if( isEvenDigit(nums[i]) == 1){
                count++;
            }
        }
        
        return count;
    }
    
    public int isEvenDigit(int num){
        
        if(num < 0){
            num = num * (-1);
        }
        int itr = 0;
        while(num > 0){
            num = num / 10;
            itr++;
        }
        if(itr%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
