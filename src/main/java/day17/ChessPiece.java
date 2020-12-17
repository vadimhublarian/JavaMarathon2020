package day17;

/**
 * Created by Vadim Khublarian on 12/17/20.
 */
public enum ChessPiece {
    KING_WHITE("♔", 100.0),
    QUEEN_WHITE("♕", 9.0),
    ROOK_WHITE("♖", 5.0),
    BISHOP_WHITE("♗", 3.5),
    KNIGHT_WHITE("♘", 3.0),
    PAWN_WHITE("♙", 1.0),

    KING_BLACK("♚", 100.0),
    QUEEN_BLACK("♛", 9.0),
    ROOK_BLACK("♜", 5.0),
    BISHOP_BLACK("♝", 3.5),
    KNIGHT_BLACK("♞", 3.0),
    PAWN_BLACK("♟", 1.0),

    EMPTY("_", -1.0);

    private String figureName;
    private Double figureScore;

    ChessPiece(String figureName, Double figureScore) {
        this.figureName = figureName;
        this.figureScore = figureScore;
    }

    public String getFigureName() {
        return figureName;
    }

    public Double getFigureScore() {
        return figureScore;
    }
}
