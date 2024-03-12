package com.lingarogrup.exercise8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {
    private ChessBoard board;

    @BeforeEach
    void setUp() {
        board = new ChessBoard();
    }

    @Test
    public void pawnCanMoveOneForward() {
        board.addPiece("a1", "pawn");
        ChessPiece pawn = board.retrieveByLocation("a1");
        String possibleMoves = pawn.getPossibleMoves();
        assertEquals("a2", possibleMoves, "should have ability to move to a2");

        board.addPiece("e5", "pawn");
        ChessPiece pawn2 = board.retrieveByLocation("e5");
        String possibleMoves2 = pawn2.getPossibleMoves();
        assertEquals("e6", possibleMoves2, "should have ability to move to e6");

        board.addPiece("h8", "pawn");
        ChessPiece pawn3 = board.retrieveByLocation("h8");
        String possibleMoves3 = pawn3.getPossibleMoves();
        assertEquals("", possibleMoves3, "should have no ability to move");
    }

    @Test
    public void pawnCanMoveTwoForwardOnFirstMove() {
        board.addPiece("a2", "pawn");
        ChessPiece pawn = board.retrieveByLocation("a2");
        String possibleMoves = pawn.getPossibleMoves();
        assertEquals("a4, a3", possibleMoves, "should be able to move both one and two squares forward");
    }

    @Test
    public void pawnCanNotMoveTwoAfterFirstMove() {
        board.addPiece("a3", "pawn");
        ChessPiece pawn = board.retrieveByLocation("a3");
        String possibleMoves = pawn.getPossibleMoves();
        boolean canMoveTwoSquares = possibleMoves.contains("a5");
        assertTrue(!canMoveTwoSquares);

        board.addPiece("a4", "pawn");
        ChessPiece pawn2 = board.retrieveByLocation("a4");
        String possibleMoves2 = pawn2.getPossibleMoves();
        boolean canMoveTwoSquares2 = possibleMoves2.contains("a6");
        assertTrue(!canMoveTwoSquares2);
    }
}