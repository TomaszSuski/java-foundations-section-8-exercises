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
        String output;
        String northByTwoSquares = String.valueOf(10 - getStartingRank());
        String northByOneSquare = String.valueOf(9 - getStartingRank());
        String southByTwoSquares = String.valueOf(6 - getStartingRank());
        String southByOneSquare = String.valueOf(7 - getStartingRank());
        String eastByTwoSquares = Character.toString(getStartingField() + 99);
        String eastByOneSquare = Character.toString(getStartingField() + 98);
        String westByTwoSquares =  Character.toString(getStartingField() + 95);
        String westByOneSquare = Character.toString(getStartingField() + 96);
        String northEast = eastByOneSquare + northByTwoSquares;
        String northWest = westByOneSquare + northByTwoSquares;
        String eastNorth = eastByTwoSquares + northByOneSquare;
        String eastSouth = eastByTwoSquares + southByOneSquare;
        String westNorth = westByTwoSquares + northByOneSquare;
        String westSouth = westByTwoSquares + southByOneSquare;
        String southEast = eastByOneSquare + southByTwoSquares;
        String southWest = westByOneSquare + southByTwoSquares;
        output = String.format("%s, %s, %s, %s, %s, %s, %s, %s",
                northEast, northWest, eastNorth, eastSouth, westNorth, westSouth, southEast, southWest);
        return output;
    }
}
