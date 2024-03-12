package com.lingarogrup.exercise8;

public class ChessBoard {
    ChessPiece[][] board = new ChessPiece[8][8];
    public void addPiece(String location, String piece, boolean isBlack) {
        if ("pawn".equals(piece)) {
            Pawn pawn = new Pawn(location, isBlack);
            setPieceOnBoard(pawn);
        } else if ("knight".equals(piece)) {
            Knight knight = new Knight(location, isBlack);
            setPieceOnBoard(knight);
        }
    }

    public ChessPiece retrieveByLocation(String location) {
        return board[getField(location)][getRank(location)];
    }

    private int getField(String location) {
        return Character.codePointAt(location, 0) - 97;
    }

    private int getRank(String location) {
        return 8 - Integer.parseInt(location.substring(1));
    }

    private void setPieceOnBoard(ChessPiece piece) {
        board[piece.getField()][piece.getRank()] = piece;
    }
}
