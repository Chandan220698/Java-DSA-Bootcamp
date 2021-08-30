class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
        
        for(int i = 0;   i < n/2;  i++){
            
            arr[i] = (i - (n/2));       // -2 -1
            arr[n-1-i] = (n/2)-i;       // arr[4] = 2, arr[3] = 1
        }
        // Remove Comments for 0ms runtime
        // for odd length array, no need to initilize the middle element as
        //by default all elements are zero
        return arr;
    }
}
