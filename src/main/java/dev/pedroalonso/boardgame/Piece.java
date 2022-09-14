package dev.pedroalonso.boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

    protected Position getPosition() {
        return position;
    }

    protected void setPosition(Position position) {
        this.position = position;
    }
}
