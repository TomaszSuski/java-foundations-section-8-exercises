package com.lingarogrup.exercise8;

public abstract class ChessPiece {
    private int field;
    private int rank;

    public ChessPiece(String location) {
        field = Character.codePointAt(location, 0) - 97;
        rank = 8 - Integer.parseInt(location.substring(1));
    }

    protected int getField() {
        return field;
    }

    protected int getRank() {
        return rank;
    }

    public abstract String toString();

    public abstract String getPossibleMoves();
}
