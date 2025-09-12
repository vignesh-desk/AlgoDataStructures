package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.IsValidSudoku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIsValidSudoku {
    @Test
    public void testValidSudoku() {
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        var my_result = IsValidSudoku.check(board);

        // Derive your solution here and replace the hard coded result
        var your_result = true;

        Assertions.assertEquals(your_result, my_result);
    }
}
