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
        String northByTwoSquares = String.valueOf(10 - this.getStartingRank());
        String northByOneSquare = String.valueOf(9 - this.getStartingRank());
        String southByTwoSquares = String.valueOf(6 - this.getStartingRank());
        String southByOneSquare = String.valueOf(7 - this.getStartingRank());
        String eastByTwoSquares = Character.toString(this.getStartingField() + 99);
        String eastByOneSquare = Character.toString(this.getStartingField() + 98);
        String westByTwoSquares =  Character.toString(this.getStartingField() + 95);
        String westByOneSquare = Character.toString(this.getStartingField() + 96);
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
