package tictactoe;

/**
 * 
 * Enumerator for Xs and Os
 *
 */
public enum Symbol {
    X('X'), O('O'), None(' ');

    private char ch;

    //constructor
    Symbol(char ch) {
        this.ch = ch;
    }
    
    public char toChar() {
        return this.ch;
    }
    
    @Override
    //convert char to string
    public String toString() {
        return String.format("%c", this.ch);
    }
}
