class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        ArrayList<Integer> missArr = new ArrayList<>();
        
        for(int i = 1;   i < arr[arr.length - 1];    i++){
            if(!binarySearch(arr, i)){
                missArr.add(i);
            }
            if(missArr.size()==k){
                return missArr.get(k-1);
            }
        }
        return (arr[arr.length-1] + k - missArr.size());
    }
    
    public boolean binarySearch(int[] arr, int target){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else
                return true;
        }
        return false;
    }
}
