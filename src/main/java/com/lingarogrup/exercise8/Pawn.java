package com.lingarogrup.exercise8;

public class Pawn extends ChessPiece {
    public Pawn(String location) {
        super(location);
    }

    @Override
    public String toString() {
        return "pawn";
    }

    @Override
    public String getPossibleMoves() {
        String possibleField = Character.toString(this.getField() + 97);
        String possibleRank;
        String output = "";
        if (!isOnTheLastRank()) {
            possibleRank = String.valueOf(9 - this.getRank());
            output = possibleField + possibleRank;
        }
        return output;
    }

    private boolean isOnTheLastRank() {
        return this.getRank() == 0;
    }
}
