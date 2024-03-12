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
        String output;
        String possibleField = Character.toString(this.getField() + 97);
        String possibleRank = String.valueOf(9 - this.getRank());
        String fieldLeft = Character.toString(this.getField() + 96);
        String fieldRight = Character.toString(this.getField() + 98);
        String forward = possibleField + possibleRank;
        String diagonallyRight = fieldRight + possibleRank;
        String diagonallyLeft = fieldLeft + possibleRank;

        output = String.format("%s, %s. %s", forward, diagonallyRight, diagonallyLeft);
        if (isOnTheStartingPosition()) {
            String possibleRankTwoSquare = String.valueOf(10 - this.getRank());
            String forwardTwoSquare = possibleField + possibleRankTwoSquare;
            output += String.format(", %s", forwardTwoSquare);
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
