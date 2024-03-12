package com.lingarogrup.exercise8;

public abstract class ChessPiece {
    private final int startingField;
    private final int startingRank;
    private final boolean isBlack;

    public ChessPiece(String location, boolean isBlack) {
        startingField = ChessBoard.getFieldIndexFromLocation(location);
        startingRank = ChessBoard.getRankIndexFromLocation(location);
        this.isBlack = isBlack;
    }

    protected int getStartingField() {
        return startingField;
    }

    protected int getStartingRank() {
        return startingRank;
    }

    public abstract String toString();

    public abstract String getPossibleMoves();

    public boolean isBlack() {
        return isBlack;
    }
}
