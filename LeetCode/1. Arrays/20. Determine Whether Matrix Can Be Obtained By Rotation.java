class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        boolean flag = true;
        
        // first rotation check
        for(int i = 0;  i < mat.length; i++){
            for(int j = 0;  j < mat.length; j++){

                if(mat[mat.length-1-j][i] != target[i][j]){
                    flag = false;
                }
            }
        }
        // 2nd rotation check
        if(flag == false){
            flag = true;
            for(int i = 0;  i < mat.length; i++){
                for(int j = 0;  j < mat.length; j++){

                    if(mat[mat.length-1-i][mat.length-1-j] != target[i][j]){
                        flag = false;
                    }
                }
            }
        }
        // 3rd rotation check
        if(flag == false){
            flag = true;
            for(int i = 0;  i < mat.length; i++){
                for(int j = 0;  j < mat.length; j++){

                    if(mat[j][mat.length-1-i] != target[i][j]){
                        flag = false;
                    }
                }
            }
        }
        // zero rotation
        if(flag == false){
            flag = true;
            for(int i = 0;  i < mat.length; i++){
                for(int j = 0;  j < mat.length; j++){

                    if(mat[i][j] != target[i][j]){
                        flag = false;
                    }
                }
            }
        }
        
        return flag;
    }    
    
}
