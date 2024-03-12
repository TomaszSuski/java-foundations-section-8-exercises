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
        String forwardField = Character.toString(getStartingField() + 97);
        String forwardRank = isBlack() ? String.valueOf(7 - getStartingRank()) : String.valueOf(9 - getStartingRank());
        String fieldLeft = Character.toString(getStartingField() + 96);
        String fieldRight = Character.toString(getStartingField() + 98);
        String forward = forwardField + forwardRank;
        String diagonallyRight = fieldRight + forwardRank;
        String diagonallyLeft = fieldLeft + forwardRank;

        output = String.format("%s, %s. %s", forward, diagonallyRight, diagonallyLeft);
        if (isOnTheStartingPosition()) {
            String possibleRankTwoSquare = isBlack() ?
                    String.valueOf(6 - getStartingRank()) : String.valueOf(10 - getStartingRank());
            String forwardTwoSquare = forwardField + possibleRankTwoSquare;
            output += String.format(", %s", forwardTwoSquare);
        }
        if (isOnTheLastRank()) output = "";
        return output;
    }

    private boolean isOnTheStartingPosition() {
        int startingRank = isBlack() ? 1 : 6;
        return getStartingRank() == startingRank;
    }

    private boolean isOnTheLastRank() {
        int lastRank = isBlack() ? 7 : 0;
        return getStartingRank() == lastRank;
    }
}
