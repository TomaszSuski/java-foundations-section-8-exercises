package com.lingarogrup.exercise8;

public class ChessBoard {
    ChessPiece[][] board = new ChessPiece[8][8];
    public static int getFieldIndexFromLocation(String location) {
        return Character.codePointAt(location, 0) - 97;
    }

    public static int getRankIndexFromLocation(String location) {
        return 8 - Integer.parseInt(location.substring(1));
    }

    public void addPiece(String location, String piece, boolean isBlack) {
        if ("pawn".equals(piece)) {
            Pawn pawn = new Pawn(location, isBlack);
            setNewPieceOnBoard(pawn);
        } else if ("knight".equals(piece)) {
            Knight knight = new Knight(location, isBlack);
            setNewPieceOnBoard(knight);
        }
    }

    public ChessPiece retrieveByLocation(String location) {
        return board[getFieldIndexFromLocation(location)][getRankIndexFromLocation(location)];
    }

    public void move(String currentPosition, String newPosition) {
        ChessPiece piece = this.retrieveByLocation(currentPosition);
        String possibleMoves = piece.getPossibleMoves();
        if (possibleMoves.contains(newPosition)) {
            removePiece(currentPosition);
            setPieceOnBoard(piece, newPosition);
        }
    }

    private void setNewPieceOnBoard(ChessPiece piece) {
        board[piece.getStartingField()][piece.getStartingRank()] = piece;
    }

    private void setPieceOnBoard(ChessPiece piece, String newPosition) {
        board[getFieldIndexFromLocation(newPosition)][getRankIndexFromLocation(newPosition)] = piece;
    }

    private void removePiece(String location) {
        board[getFieldIndexFromLocation(location)][getRankIndexFromLocation(location)] = null;
    }
}
