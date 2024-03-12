package com.lingarogrup.exercise8;

public class Pawn extends ChessPiece {
    public Pawn(String location, boolean isBlack) {
        super(location, isBlack);
    }

    @Override
    public String toString() {
        return "pawn";
    }

    @Override
    public String getPossibleMoves() {
        String output;
        String forwardField = Character.toString(this.getStartingField() + 97);
        String forwardRank = this.isBlack() ? String.valueOf(7 - this.getStartingRank()) : String.valueOf(9 - this.getStartingRank());
        String fieldLeft = Character.toString(this.getStartingField() + 96);
        String fieldRight = Character.toString(this.getStartingField() + 98);
        String forward = forwardField + forwardRank;
        String diagonallyRight = fieldRight + forwardRank;
        String diagonallyLeft = fieldLeft + forwardRank;

        output = String.format("%s, %s. %s", forward, diagonallyRight, diagonallyLeft);
        if (isOnTheStartingPosition()) {
            String possibleRankTwoSquare = this.isBlack() ?
                    String.valueOf(6 - this.getStartingRank()) : String.valueOf(10 - this.getStartingRank());
            String forwardTwoSquare = forwardField + possibleRankTwoSquare;
            output += String.format(", %s", forwardTwoSquare);
        }
        if (isOnTheLastRank()) output = "";
        return output;
    }

    private boolean isOnTheStartingPosition() {
        int startingRank = this.isBlack() ? 1 : 6;
        return this.getStartingRank() == startingRank;
    }

    private boolean isOnTheLastRank() {
        int lastRank = this.isBlack() ? 7 : 0;
        return this.getStartingRank() == lastRank;
    }
}
