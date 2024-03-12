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

    public abstract String toString();

    public abstract String getPossibleMoves();

    public String getColor() {
        return isBlack ? "black" : "white";
    }

    protected int getStartingField() {
        return startingField;
    }

    protected int getStartingRank() {
        return startingRank;
    }

    protected boolean isBlack() {
        return isBlack;
    }
}
