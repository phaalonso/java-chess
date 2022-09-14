package dev.pedroalonso.chess;

import dev.pedroalonso.boardgame.Board;
import dev.pedroalonso.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
