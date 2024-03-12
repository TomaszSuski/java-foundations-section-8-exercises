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
}