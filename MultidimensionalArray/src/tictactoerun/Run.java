package tictactoerun;

import tictactoe.Board;
import tictactoe.Symbol;


public class Run {

    public static void main(String[] args) {
        Board game = new Board();
        game.Draw();
        
        game.Place(Symbol.X, 1, 1);
        game.Draw();
        
        game.Place(Symbol.O, 2, 1);
        game.Draw();
    }
    
}