package org.dsa.learn.arrays.unsorted;

import java.util.HashSet;

public class IsValidSudoku {
    public static boolean check(char[][] board) {
        var set = new HashSet<>();

        // Check the row and make sure there is no duplicate
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] == '.') continue;
                if (set.contains(board[row][col])) return false;
                set.add(board[row][col]);
            }
            set = new HashSet<>();
        }

        // Check the column and make sure there is no duplicate
        for(int col = 0; col < board[0].length; col++) {
            for(int row = 0; row < board.length; row++) {
                if(board[row][col] == '.') continue;
                if(set.contains(board[row][col])) return false;
                set.add(board[row][col]);
            }
            set = new HashSet<>();
        }

        // Check the 3 * 3
        for(int boxRow = 0; boxRow < board.length; boxRow += 3) {
            for(int boxCol = 0; boxCol < board[0].length; boxCol += 3) {
                for(int row = boxRow; row < boxRow + 3; row++) {
                    for(int col = boxCol; col < boxCol + 3; col++) {
                        if(board[row][col] == '.') continue;
                        if(set.contains(board[row][col])) return false;
                        set.add(board[row][col]);
                    }
                }
                set = new HashSet<>();
            }
        }
        return true;
    }
}
