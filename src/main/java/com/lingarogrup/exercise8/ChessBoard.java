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
        ChessPiece piece = retrieveByLocation(currentPosition);
        if (checkMoveIsValid(currentPosition, newPosition)) {
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

    private boolean checkMoveIsValid(String currentPosition, String newPosition) {
        ChessPiece pieceToMove = this.retrieveByLocation(currentPosition);
        if (pieceToMove == null) return false;
        String possibleMoves = pieceToMove.getPossibleMoves();
        if (!possibleMoves.contains(newPosition)) return false;
        ChessPiece destinationElement = retrieveByLocation(newPosition);
        if(destinationElement == null) return true;
        String pieceColor = pieceToMove.isBlack() ? "black" : "white";
        String destinationPieceColor = destinationElement.isBlack() ? "black" : "white";
        return !pieceColor.equals(destinationPieceColor);
    }
}
