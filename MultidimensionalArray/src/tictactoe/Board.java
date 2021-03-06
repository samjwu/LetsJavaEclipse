package tictactoe;

/**
 * 
 * Class for board
 *
 */
public class Board {
    
    private Symbol[][] board;
    
    /**
     * Initializes a new board
     * which is a 2-d array of Symbols
     */
    public Board(){
        board = new Symbol[3][3];
        this.Clear();
    }
    
    /**
     * Initializes a new board using the given array 
     * @param board: the 2d array for the board
     */
    public Board(Symbol[][] board) {
        this.board = board;
    }
    
    /**
     * Erases the board, called with the constructor of the class.
     */
    public final void Clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Symbol.None;
            }           
        }
    }
    
    /**
     * Draws the current state of the board using System.out
     */
    public void Draw() {
        System.out.printf("\n  0 1 2\n"); //header
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", i); //side
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.printf("%s|", board[i][j]);
                } else {
                    System.out.printf("%s", board[i][j]);                
                }
            }
            System.out.printf("\n");
            if (i < 2) System.out.printf("  -+-+-\n");
        }
    }
    
    /**
     * Places the symbol on the board at position row and column
     * @param sym: the symbol to place (X or O)
     * @param row: the row (0, 1 or 2)
     * @param column: the column (0,1 or 2)
     * @return true if the marker was placed
     */
    public boolean Place(Symbol sym, int row, int column) {
        if (this.board[row][column] == Symbol.None) {
            this.board[row][column] = sym;
            return true;
        } else {
            return false;
        }
    }    
    
}