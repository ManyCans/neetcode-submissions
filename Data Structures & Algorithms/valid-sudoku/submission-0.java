class Solution {
    public boolean isValidSudoku(char[][] board) {
        // boolean ans = true;
        // for(int row = 0 ; row < 9 ; row++){
        //     Set<Character> seen = new HashSet<>();
        //     for(int i =0;i<9;i++){
        //         if (board[row][i]=='.') continue;
        //         if seen.contains(board[row][i]) return false;
        //         seen.add(board[row][i]);
        //     }
        // }
        // for(int col = 0 ; col < 9 ; col++){
        //     Set<Character> seen = new HashSet<>();
        //     for(int i =0;i<9;i++){
        //         if (board[i][col]=='.') continue;
        //         if seen.contains(board[i][col]) return false;
        //         seen.add(board[i][col]);
        //     }
        // }

        HashMap<Integer,Set<Integer>> row_check = new HashMap<>();
        HashMap<Integer,Set<Integer>> col_check = new HashMap<>();
        HashMap<Integer,Set<Pair<Integer,Integer>>> box_check = new HashMap<>();

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.') continue;
                int current_int = board[row][col]-'0';
                Pair<Integer, Integer> pair = new Pair<>(row/3, col/3);
                row_check.putIfAbsent(current_int, new HashSet<>());
                col_check.putIfAbsent(current_int, new HashSet<>());
                box_check.putIfAbsent(current_int, new HashSet<>());
                
                boolean row_has,col_has,box_has;
                
                row_has = row_check.get(current_int).contains(row);
                col_has = col_check.get(current_int).contains(col);
                box_has = box_check.get(current_int).contains(pair);
                if(row_has | col_has | box_has) return false;
                row_check.get(current_int).add(row);
                col_check.get(current_int).add(col);
                box_check.get(current_int).add(pair);
            }
        }
        return true;

    }
}
