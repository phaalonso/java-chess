package dev.pedroalonso.chess;

import dev.pedroalonso.boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}
