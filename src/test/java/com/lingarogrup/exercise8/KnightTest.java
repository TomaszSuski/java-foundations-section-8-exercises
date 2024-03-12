package com.lingarogrup.exercise8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    ChessBoard board;

    @BeforeEach
    public void setUp() {
        board = new ChessBoard();
    }

    @Test
    public void knightCanMoveNorthEast() {
        board.addPiece("c1", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c1");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("d3"), "should be able to move from c1 to d3");
    }

    @Test
    public void knightCanMoveNorthWest() {
        board.addPiece("c1", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c1");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("b3"), "should be able to move from c1 to b3");
    }

    @Test
    public void knightCanMoveEastNorth() {
        board.addPiece("c1", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c1");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("e2"), "should be able to move from c1 to e2");
    }

    @Test
    public void knightCanMoveEastSouth() {
        board.addPiece("c3", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c3");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("e2"), "should be able to move from c3 to e2");
    }

    @Test
    public void knightCanMoveWestNorth() {
        board.addPiece("c3", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c3");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("a4"), "should be able to move from c3 to a4");
    }

    @Test
    public void knightCanMoveWestSouth() {
        board.addPiece("c3", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c3");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("a2"), "should be able to move from c3 to a2");
    }

    @Test
    public void knightCanMoveSouthEast() {
        board.addPiece("c3", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c3");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("d1"), "should be able to move from c3 to d1");
    }


    @Test
    public void knightCanMoveSouthWest() {
        board.addPiece("c3", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c3");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("b1"), "should be able to move from c3 to b1");
    }

    @Test
    public void blackKnightCanMoveSouthEast() {
        board.addPiece("d5", "knight", true);
        ChessPiece knight = board.retrieveByLocation("d5");
        String possibleMoves = knight.getPossibleMoves();
        assertTrue(possibleMoves.contains("c7"), "should be able to move from d5 to c7");
    }
}