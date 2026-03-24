

public class Level {

    private final TileType[][] tiles;

    public Level(TileType[][] tiles) {
        this.tiles = tiles;
    }

    public TileType[][] getTiles() {
        return tiles;
    }

    public int getHeight() {
        return tiles.length;
    }

    public int getWidth() {
        return tiles[0].length;
    }

    public TileType getTile(int x, int y) {
        return tiles[y][x];
    }
}
