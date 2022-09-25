package dev.pedroalonso.application;

import dev.pedroalonso.chess.ChessException;
import dev.pedroalonso.chess.ChessMatch;
import dev.pedroalonso.chess.ChessPiece;
import dev.pedroalonso.chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);

                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }

                System.out.println("capturedPiece = " + capturedPiece);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e);
                e.printStackTrace();
                sc.nextLine();
            }
        }
    }
}