package com.lingarogrup.exercise7;

public class Exercise7 {
/*  If you modeled a chess board in Java using a two-dimensional array, how could you
convert chess notation, or coordinate notation of chess, to an element in that two-dimensional
array? For example, in the chess board image below, square a8 might map to
array[0][0], and h1 might map to array[7][7]. Make a method that takes an input String of a
chess coordinate and returns array coordinates. This exercise simply builds on the previous
two. Use the following test data:
Input   Output
a8      0,0
h1      7,7
g5      6,3
d4      3,4
*/

    public static String convertChessNotationToCoordinates(String chessNotation) {
//        String[][] chessBoard = {{"a", "b", "c", "d", "e", "f", "g", "h"}, {"8", "7", "6", "5", "4", "3", "2" ,"1"}};
        int column = Character.codePointAt(chessNotation, 0) - 97;
        int row = 8 - Integer.parseInt(chessNotation.substring(1));
        return String.format("%d,%d", column, row);
    }
}
