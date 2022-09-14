package dev.pedroalonso.application;

import dev.pedroalonso.UI;
import dev.pedroalonso.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}