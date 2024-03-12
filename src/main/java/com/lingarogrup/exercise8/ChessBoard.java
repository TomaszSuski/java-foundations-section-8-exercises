package com.lingarogrup.exercise8;

public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];

    private ChessPiece[] whitesCapturedPieces = new ChessPiece[15];

    private int whitesCaptureCount = 0;
    private ChessPiece[] blacksCapturedPieces = new ChessPiece[15];
    private int blacksCaptureCount = 0;
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

    public void move(String currentLocation, String newLocation) {
        if (!checkMoveIsValid(currentLocation, newLocation)) return;
        ChessPiece piece = retrieveByLocation(currentLocation);
        if (checkDestinationContainsEnemy(piece, newLocation)) {
            ChessPiece enemy = retrieveByLocation(newLocation);
            captureEnemy(enemy);
        }
        removePiece(currentLocation);
        setPieceOnBoard(piece, newLocation);
    }

    public ChessPiece[] getWhitesCapturedPieces() {
        return whitesCapturedPieces;
    }

    public ChessPiece[] getBlacksCapturedPieces() {
        return blacksCapturedPieces;
    }

    private void setNewPieceOnBoard(ChessPiece piece) {
        board[piece.getStartingField()][piece.getStartingRank()] = piece;
    }

    private void setPieceOnBoard(ChessPiece piece, String newLocation) {
        board[getFieldIndexFromLocation(newLocation)][getRankIndexFromLocation(newLocation)] = piece;
    }

    private void removePiece(String location) {
        board[getFieldIndexFromLocation(location)][getRankIndexFromLocation(location)] = null;
    }

    private boolean checkMoveIsValid(String currentLocation, String newLocation) {
        ChessPiece pieceToMove = this.retrieveByLocation(currentLocation);
        if (pieceToMove == null) return false;
        String possibleMoves = pieceToMove.getPossibleMoves();
        if (!possibleMoves.contains(newLocation)) return false;
        ChessPiece destinationElement = retrieveByLocation(newLocation);
        if(destinationElement == null) return true;
        return checkDestinationContainsEnemy(pieceToMove, newLocation);
    }
    
    private boolean checkDestinationContainsEnemy(ChessPiece pieceToMove, String destination) {
        ChessPiece destinationElement = retrieveByLocation(destination);
        if (destinationElement == null) return false;
        return !pieceToMove.getColor().equals(destinationElement.getColor());
    }

    private void captureEnemy(ChessPiece enemy) {
        if (enemy.isBlack()) {
            whitesCapturedPieces[whitesCaptureCount] = enemy;
            whitesCaptureCount++;
        } else {
            blacksCapturedPieces[blacksCaptureCount] = enemy;
            blacksCaptureCount++;
        }
    }
}
