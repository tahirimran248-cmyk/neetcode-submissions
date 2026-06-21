class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> s = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val = board[i][j];
                if(val!='.'){
                    int block = (i/3*3) + j/3;
                    if(s.contains("r"+i+val)||s.contains("c"+j+val)||s.contains("b"+block+val)){
                        return false;
                    }
                    else{
                        s.add("r"+i+val);
                        s.add("c"+j+val);
                        s.add("b"+block+val);
                    }
                }
            }
        }
        return true;
        
    }
    

}
