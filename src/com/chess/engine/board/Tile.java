package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public abstract class Tile {

    protected final int tileCoordinate;

    private static final Map<Integer, EmptyTile> EMPTY_TILES = createAllPossibleEmptyTiles();

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
        for(int i=0; i<64; i++){
            emptyTileMap.put(i, new EmptyTile(i));
        }
        return emptyTileMap;
    }

    {

    }
    Tile (int coordinate) {
        this.tileCoordinate = coordinate;
    }
    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

}
