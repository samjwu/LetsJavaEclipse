package example;

public class MultidimensionalArrayExample {

	public static void main(String[] args) {
        char[][] board = new char[3][3];
        board[1][2] = 'O';
        board[0][0] = 'X';
        board[1][0] = 'O';
        board[0][2] = 'X';
        board[0][1] = 'O';
        board[2][0] = 'X';
        board[2][2] = 'O';
        board[1][1] = 'X';
        board[2][1] = ' ';
        
        //print multi-dim array
        for (int i = 0; i < 3; i++) {
            for (int j = 0;j < 3; j++) {
            	System.out.printf("%s", board[i][j]);
            	//System.out.printf("[%d][%d]=%s ",i,j,board[i][j]);	
            }
            System.out.printf("\n");
        }

    }
	
}
