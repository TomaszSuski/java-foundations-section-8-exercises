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
        board.addPiece("a1", "pawn", false);
        ChessPiece pawn = board.retrieveByLocation("a1");
        String possibleMoves = pawn.getPossibleMoves();
        assertTrue(possibleMoves.contains("a2"), "should have ability to move to a2");


        board.addPiece("e5", "pawn", false);
        ChessPiece pawn2 = board.retrieveByLocation("e5");
        String possibleMoves2 = pawn2.getPossibleMoves();
        assertTrue(possibleMoves2.contains("e6"), "should have ability to move to e6");

        board.addPiece("h8", "pawn", false);
        ChessPiece pawn3 = board.retrieveByLocation("h8");
        String possibleMoves3 = pawn3.getPossibleMoves();
        assertEquals("", possibleMoves3, "should have no ability to move");

        board.addPiece("a2", "pawn", false);
        ChessPiece pawn4 = board.retrieveByLocation("a2");
        String possibleMoves4 = pawn4.getPossibleMoves();
        assertTrue(possibleMoves4.contains("a3"), "should have ability to move to a3");
    }

    @Test
    public void pawnCanMoveTwoForwardOnFirstMove() {
        board.addPiece("a2", "pawn", false);
        ChessPiece pawn = board.retrieveByLocation("a2");
        String possibleMoves = pawn.getPossibleMoves();
        assertTrue(possibleMoves.contains("a4"), "should be able to move two squares forward from starting position");
    }

    @Test
    public void pawnCanNotMoveTwoAfterFirstMove() {
        board.addPiece("a3", "pawn", false);
        ChessPiece pawn = board.retrieveByLocation("a3");
        String possibleMoves = pawn.getPossibleMoves();
        boolean canMoveTwoSquares = possibleMoves.contains("a5");
        assertFalse(canMoveTwoSquares, "should not be able to move from rank 3 to rank 5");

        board.addPiece("a4", "pawn", false);
        ChessPiece pawn2 = board.retrieveByLocation("a4");
        String possibleMoves2 = pawn2.getPossibleMoves();
        boolean canMoveTwoSquares2 = possibleMoves2.contains("a6");
        assertFalse(canMoveTwoSquares2, "should not be able to move from rank 4 to rank 6");
    }

    @Test
    public void pawnCanMoveOneDiagonallyRight() {
        board.addPiece("a1", "pawn", false);
        ChessPiece pawn1 = board.retrieveByLocation("a1");
        String possibleMoves1 = pawn1.getPossibleMoves();
        assertTrue(possibleMoves1.contains("b2"), "should be able to move from a1 to b2");

        board.addPiece("g7", "pawn", false);
        ChessPiece pawn2 = board.retrieveByLocation("g7");
        String possibleMoves2 = pawn2.getPossibleMoves();
        assertTrue(possibleMoves2.contains("h8"), "should be able to move from g7 to h8");
    }

    @Test
    public void pawnCanMoveOneDiagonallyLeft() {
        board.addPiece("h1", "pawn", false);
        ChessPiece pawn1 = board.retrieveByLocation("h1");
        String possibleMoves1 = pawn1.getPossibleMoves();
        assertTrue(possibleMoves1.contains("g2"), "should be able to move from h1 to g2");

        board.addPiece("b7", "pawn", false);
        ChessPiece pawn2 = board.retrieveByLocation("b7");
        String possibleMoves2 = pawn2.getPossibleMoves();
        assertTrue(possibleMoves2.contains("a8"), "should be able to move from b7 to a8");
    }

    @Test
    public void blackPawnCanMoveForward() {
        board.addPiece("a8", "pawn", true);
        ChessPiece pawn = board.retrieveByLocation("a8");
        String possibleMoves = pawn.getPossibleMoves();
        assertTrue(possibleMoves.contains("a7"), "should be able to move from a8 to a7");

        board.addPiece("g2", "pawn", true);
        ChessPiece pawn2 = board.retrieveByLocation("g2");
        String possibleMoves2 = pawn2.getPossibleMoves();
        assertTrue(possibleMoves2.contains("g1"), "should be able to move from g2 to g1");
    }

    @Test
    public void blackPawnCanMoveTwoForwardOnFirstMove() {
        board.addPiece("a7", "pawn", true);
        ChessPiece pawn = board.retrieveByLocation("a7");
        String possibleMoves = pawn.getPossibleMoves();
        System.out.println(possibleMoves);
        assertTrue(possibleMoves.contains("a5"), "should be able to move two squares forward from starting position");
    }
}