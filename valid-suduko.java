class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];


        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();

        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                char value=board[r][c];
                int index=(r/3)*3+(c/3);

                if(rows[r].contains(value) || col[c].contains(value) || box[index].contains(value)){
                return false;
            }
            
            rows[r].add(value);
            col[c].add(value);
            box[index].add(value);
        }
        }
        return true;
    }
}
