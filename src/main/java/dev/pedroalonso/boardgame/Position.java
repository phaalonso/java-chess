package dev.pedroalonso.boardgame;

import java.util.Objects;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        if (row < 0) {
            throw new RuntimeException("Piece row must be greater than 0");
        }
        if (column < 0) {
            throw new RuntimeException("Piece column must be greater than 0");
        }

        this.row = row;
        this.column = column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Position{" + row + ", " + column + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return row == position.row && column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}
