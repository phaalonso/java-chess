package dev.pedroalonso.application;

import dev.pedroalonso.chess.ChessException;
import dev.pedroalonso.chess.ChessMatch;
import dev.pedroalonso.chess.ChessPiece;
import dev.pedroalonso.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        boolean isGameRunning = true;

        while (isGameRunning) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());

                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                System.out.println("capturedPiece = " + capturedPiece);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e);
                sc.nextLine();
            }
        }
    }
}