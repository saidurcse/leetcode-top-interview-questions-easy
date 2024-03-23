https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/

class Solution {
    private fun isValid(board: Array<CharArray>, num: Char, row: Int, column: Int): Boolean {
        return rowCheck(board, num, row, column) && colCheck(board, num, row, column) && boxCheck(board, num, row, column)
    }

    private fun rowCheck(board: Array<CharArray>, num: Char, row: Int, column: Int): Boolean {
        
        for (i in board.indices) {            
            if (i != column && board[row][i] == num) {                
                return false
            }
        }
        return true
    }

    private fun colCheck(board: Array<CharArray>, num: Char, row: Int, column: Int): Boolean {
        for (i in board.indices) {
            if (i != row && board[i][column] == num) {
                return false
            }
        }
        return true
    }

    private fun boxCheck(board: Array<CharArray>, num: Char, row: Int, column: Int): Boolean {
        val boxRow = row - row % 3
        val boxCol = column - column % 3
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (i + boxRow != row && j + boxCol != column && board[i + boxRow][j + boxCol] == num) {
                    return false
                }
            }
        }
        return true
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] != '.') {
                    if (!isValid(board, board[i][j], i, j)) {
                        //println("${board[i][j]} at $i,$j is invalid")
                        return false
                    }
                }
            }
        }
        return true
    }
}

//  Time Complexity: O(n^3)
//  Space Complexity: O(n^2)

