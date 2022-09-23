package dev.pedroalonso.chess;

import dev.pedroalonso.boardgame.Board;
import dev.pedroalonso.boardgame.Position;
import dev.pedroalonso.chess.pieces.King;
import dev.pedroalonso.chess.pieces.Rook;

public class ChessMatch {
    private final Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    public void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        this.placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        this.placeNewPiece('e', 8, new King(board, Color.BLACK));
        this.placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
