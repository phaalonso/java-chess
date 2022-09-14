package dev.pedroalonso.chess.pieces;

import dev.pedroalonso.boardgame.Board;
import dev.pedroalonso.chess.ChessPiece;
import dev.pedroalonso.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
