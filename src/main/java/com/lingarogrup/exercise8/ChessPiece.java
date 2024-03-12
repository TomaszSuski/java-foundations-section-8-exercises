package com.lingarogrup.exercise8;

public abstract class ChessPiece {
    private int field;
    private int rank;
    private final boolean isBlack;

    public ChessPiece(String location, boolean isBlack) {
        field = Character.codePointAt(location, 0) - 97;
        rank = 8 - Integer.parseInt(location.substring(1));
        this.isBlack = isBlack;
    }

    protected int getField() {
        return field;
    }

    protected int getRank() {
        return rank;
    }

    public abstract String toString();

    public abstract String getPossibleMoves();

    public boolean isBlack() {
        return isBlack;
    }
}
