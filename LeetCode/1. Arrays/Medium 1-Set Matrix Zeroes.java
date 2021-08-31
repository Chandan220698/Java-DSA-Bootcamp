class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0;  i < row;    i++){
            for(int j = 0;  j < col;    j++){
                
                if(matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                }
                
            }
        }
        
        for(int i = 0;  i < list.size();    i += 2){
            setZero(matrix, list.get(i), list.get(i+1));
        }
        
    }
    
    public void setZero(int[][] matrix, int x, int y){
        
        // Setting row to zero
        for(int i = 0;  i < matrix[0].length;   i++)
            matrix[x][i] = 0;
        // Setting col to zero
        for(int i = 0;  i < matrix.length;   i++)
            matrix[i][y] = 0;
        
    }
}
