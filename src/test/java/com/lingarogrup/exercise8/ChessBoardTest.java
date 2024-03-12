package com.lingarogrup.exercise8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}