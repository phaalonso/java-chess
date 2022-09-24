package dev.pedroalonso.chess.pieces;

import dev.pedroalonso.boardgame.Board;
import dev.pedroalonso.boardgame.Position;
import dev.pedroalonso.chess.ChessPiece;
import dev.pedroalonso.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().getPiece(position);

        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] moves = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // above
        p.setValues(getPosition().getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        // below
        p.setValues(getPosition().getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        // left
        p.setValues(getPosition().getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        // right
        p.setValues(getPosition().getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        // top right
        p.setValues(getPosition().getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        // top left
        p.setValues(getPosition().getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        //bottom right
        p.setValues(getPosition().getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        //bottom left
        p.setValues(getPosition().getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        return moves;
    }

    @Override
    public String toString() {
        return "K";
    }
}
