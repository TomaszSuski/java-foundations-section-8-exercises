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
        String possibleRank = String.valueOf(9 - this.getRank());
        String possibleRankTwoSquare = String.valueOf(10 - this.getRank());
        String output = null;
        if (isOnTheStartingPosition()) {
            output = String.format("%s%s, %s%s", possibleField, possibleRankTwoSquare, possibleField, possibleRank);
        } else {
                output = possibleField + possibleRank;
        }
        if (isOnTheLastRank()) output = "";
        return output;
    }

    private boolean isOnTheStartingPosition() {
        return this.getRank() == 6;
    }

    private boolean isOnTheLastRank() {
        return this.getRank() == 0;
    }
}
