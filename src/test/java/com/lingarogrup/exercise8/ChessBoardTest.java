package com.lingarogrup.exercise8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    private ChessBoard board;

    @BeforeEach
    void setUp() {
        board = new ChessBoard();
    }

    @Test
    public void canAddPawn(){
        board.addPiece("a1", "pawn", false);
        ChessPiece piece = board.retrieveByLocation("a1");
        assertEquals("pawn", piece.toString());
    }

    @Test
    public void canAddKnight(){
        board.addPiece("a1", "knight", false);
        ChessPiece piece = board.retrieveByLocation("a1");
        assertEquals("knight", piece.toString());
    }

    @Test
    public void canMoveC1KnightToD3() {
        board.addPiece("c1", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c1");
        assertNotNull(knight, "should contain knight on c1");
        board.move("c1", "d3");
        assertNull(board.retrieveByLocation("c1"), "square c1 should now be empty");
        assertEquals("knight", board.retrieveByLocation("d3").toString(), "square d3 should now contain knight");
    }

    @Test
    public void canNotMoveC1KnightToInvalidSquare() {
        board.addPiece("c1", "knight", false);
        ChessPiece knight = board.retrieveByLocation("c1");
        assertNotNull(knight, "should contain knight on c1");
        board.move("c1", "d4");
        assertNull(board.retrieveByLocation("d4"), "square d4 should still be empty");
        assertEquals("knight", board.retrieveByLocation("c1").toString(), "square c1 should still contain knight");
    }

    @Test
    public void canNotMoveC1KnightToFriendlyOccupiedSquare() {
        board.addPiece("c1", "knight", false);
        board.addPiece("d3", "pawn", false);
        board.move("c1", "d3");
        assertEquals("knight", board.retrieveByLocation("c1").toString(), "knight should remain on c1");
        assertEquals("pawn", board.retrieveByLocation("d3").toString(), "pawn should remain on d3");
    }

    @Test
    public void canMoveC1KnightToEnemyOccupiedSquare() {
        board.addPiece("c1", "knight", false);
        ChessPiece whiteKnight = board.retrieveByLocation("c1");
        board.addPiece("d3", "pawn", true);
        ChessPiece blackPawn = board.retrieveByLocation("d3");
        board.move("c1", "d3");
        assertSame(whiteKnight, board.retrieveByLocation("d3"), "white knight should move to d3");
        assertTrue(Arrays.asList(board.getWhitesCapturedPieces()).contains(blackPawn),
                "black pawn should be moved to white's captured array");
    }
}