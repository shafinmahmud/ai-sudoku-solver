/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shafin.ai.sudokusolver;

/**
 *
 * @author SHAFIN
 */
public class SudokuBoard {
    final int EMPTY = 0;      // Empty cells marker
    final int size;           // Size of the board (number of rows and columns)
    final int box_size;       // Size of the inner boxes

    private int[][] board;    // 2D array representing the game board

    /**
     * Creates an empty board.
     * @param size Number of rows and columns of the board.
     */
    public SudokuBoard(int size) {
        board = new int[size][size];
        this.size = size;
        this.box_size = (int) Math.sqrt(size);
    }
    
    /**
     * Creates and initializes the board.
     * @param board Array to initialize the board contents.
     */
    public SudokuBoard(int[][] board) {
        this(board.length);
        this.board = board;
    }
    
    /**
     * Puts a number into a specific cell.
     * @param num Number to put into the board cell.
     * @param row Cell's row.
     * @param col Cell's column.
     */
    public void setCell(int num, int row, int col) {
        board[row][col] = num;
    }

    /**
     * Returns the number contained in a specific cell.
     * @param row Cell's row.
     * @param col Cell's column.
     * @return The number contained in the cell.
     */
    public int getCell(int row, int col) {
        return board[row][col];
    }
}
