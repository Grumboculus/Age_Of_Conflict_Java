import TerrainMap;

public class WorldMap {
    final int height;
    final int width;

    WorldMap(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void BuildOwnerMap(TerrainMap TerrainMap) {
        
    }

    public TerrainMap BuildTerrainMap() {
        return new TerrainMap(height, width);
    }
}