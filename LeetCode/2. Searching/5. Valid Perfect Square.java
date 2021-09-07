class Solution {
    public boolean isPerfectSquare(int num) {
      
        // Taking long because of num's contraints
      
        long start = 1;
        long end = num;
        
        if(num==1){
            return true;
        }
        while(start <= end){
            
            long mid = start + (end - start)/2;
            
            if(mid*mid > num){
                end = mid - 1;
            }else if(mid*mid < num){
                start = mid + 1;
            }else{
                return true;
            }
            
        }
        return false;
    }
}
