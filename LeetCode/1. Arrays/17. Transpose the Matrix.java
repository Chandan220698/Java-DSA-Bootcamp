class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int[][] tArr = new int[matrix[0].length][matrix.length];
            
        // The no. of rows and cols will change so
        // condition of row and col will also change
        
        for(int row = 0;    row < matrix[0].length;   row++)
        {
            for(int col = 0;    col < matrix.length;   col++)
            {
                tArr[row][col] = matrix[col][row];
            }
        }
        
        return tArr;
    }
}
