class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;
        int result[][] = new int[n][n];
        
        for(int row = 0;    row < n; row++){
            for(int col = 0;    col < n/2;  col++){
                // flipping and inverting the elementing and inserting in result array
                result[row][n-col-1] = invert(image[row][col]);
                result[row][col] = invert(image[row][n-col-1]);
            }
            // if - for inserting value in middle column which is left null in case of 
            // in case of odd ordered matrix
            if(n % 2 == 1){
                result[row][n/2] = invert(image[row][n/2]);
            }
        }

        return result;
    }
    
    // Function to invert the elements
    public int invert(int num){
        if(num == 1){
            return 0;
        }
        return 1;
    }
}
