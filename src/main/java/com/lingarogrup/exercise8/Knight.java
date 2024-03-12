package com.lingarogrup.exercise8;

public class Knight extends ChessPiece {
    public Knight(String location, boolean isBlack) {
        super(location, isBlack);
    }

    @Override
    public String toString() {
        return "knight";
    }

    @Override
    public String getPossibleMoves() {
        return null;
    }
}
