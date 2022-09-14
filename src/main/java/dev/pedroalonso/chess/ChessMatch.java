package dev.pedroalonso.chess;

import dev.pedroalonso.boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int row = 0; row < board.getRows(); row++) {
            for (int column = 0; column < board.getColumns(); column++) {
               mat[row][column] = (ChessPiece) board.getPiece(row, column);
            } 
        }

        return mat;
    }
}
