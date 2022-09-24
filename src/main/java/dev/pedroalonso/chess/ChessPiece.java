package dev.pedroalonso.chess;

import dev.pedroalonso.boardgame.Board;
import dev.pedroalonso.boardgame.Piece;
import dev.pedroalonso.boardgame.Position;

public abstract class ChessPiece extends Piece {
    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().getPiece(position);

        return p != null && p.getColor() != color;
    }
}
