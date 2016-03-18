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
public class Main {
     /**
     * Creates the GUI with a default puzzle.
     * @params args Command-line arguments (unused)
     */
    public static void main(String[] args) {
        int[][] board = {{0, 6, 0, 1, 0, 4, 0, 5, 0},
                         {0, 0, 8, 3, 0, 5, 6, 0, 0},
                         {2, 0, 0, 0, 0, 0, 0, 0, 1},
                         {8, 0, 0, 4, 0, 7, 0, 0, 6},
                         {0, 0, 6, 0, 0, 0, 3, 0, 0},
                         {7, 0, 0, 9, 0, 1, 0, 0, 4},
                         {5, 0, 0, 0, 0, 0, 0, 0, 2},
                         {0, 0, 7, 2, 0, 6, 9, 0, 0},
                         {0, 4, 0, 5, 0, 8, 0, 7, 0}};
        
        new SwingSudoKiller(new SwingSudokuBoard(board));
    }   
}
