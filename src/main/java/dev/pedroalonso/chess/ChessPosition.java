package dev.pedroalonso.chess;

import dev.pedroalonso.boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /**
     * column a - a -> 0
     *        b - a -> 1
     *        c - a -> 2
     *        ...
     * o row na matrix começa a contar a partir de cima pra baixo
     * por isso devemos subtrair 8
     * @return position
     */
    public Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        System.out.println("position = " + position);
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
