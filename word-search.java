class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;
        if (word.length() == 0) return true;

       //This problem can be solved using DFS with backtracking.
        // We start DFS from every cell in the grid since the word can begin anywhere.
        // In the DFS, we first check boundary conditions and whether the current character matches the corresponding character in the word.
        // If it matches, we temporarily mark the cell as visited to avoid reusing it in the same path, then recursively explore all four directions.
        // If any recursive call returns true, the word is found.
        // If the path fails, we backtrack by restoring the original character and continue searching.
        // The base case occurs when we have matched all characters of the word.

        for(int i =0;i<board.length; i++){
            for(int j =0; j<board[0].length; j++){
                if(dfs(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;


    }
    public boolean dfs(char[][] board, String word, int index, int i, int j){
        if(index == word.length()){
            return true;
        }
        if( i <0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] == '#' || board[i][j] != word.charAt(index)){
            return false;
        }
    board[i][j]='#';
    boolean res = dfs(board,word,index+1,i-1,j) || dfs(board,word,index+1,i+1,j) || dfs(board, word, index+1, i,j-1) || dfs(board,word, index+1, i, j+1);
    board[i][j] = word.charAt(index);
    return res;      
    }
}
