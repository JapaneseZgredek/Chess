package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public final class OccupiedTile extends Tile{

    private final Piece piece;

    OccupiedTile(final int coordinate, Piece piece) {
        super(coordinate);
        this.piece = piece;
    }

    @Override
    public boolean isTileOccupied() {
        return true;
    }

    @Override
    public Piece getPiece() {
        return this.piece;
    }
}
