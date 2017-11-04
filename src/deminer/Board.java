package deminer;

import java.util.HashMap;
import java.util.Map;

/**
 * Board
 */
public class Board {

    private final Map<Integer, Map<Integer, Zone>> ALL_COORDINATES = new HashMap<>();

    private final int aWidth;
    private final int aHeight;

    public Board(int pWidth, int pHeight) {
        aWidth = pWidth;
        aHeight = pHeight;
    }
    
    /**
     * @param x coordinate
     * @param y coordinate
     * @param pValue Value of the EmptyZone
     * @return The reference to the created EmptyZone
     * @pre Coordinates are inside the board
     */
    public EmptyZone createEmptyZone(int x, int y, int pValue) {
        assert x < aWidth && y < aHeight;
        if (!ALL_COORDINATES.containsKey(x)) {
            Map<Integer, Zone> map = new HashMap<>();
            map.put(y, new EmptyZone(pValue));
            ALL_COORDINATES.put(x, map);
        }
        else if (!ALL_COORDINATES.get(x).containsKey(y)) {
            ALL_COORDINATES.get(x).put(y, new EmptyZone(pValue));
        }
        return (EmptyZone)ALL_COORDINATES.get(x).get(y);
    }
    
    /**
     * createEmptyZone overload with String pValue
     * @param x coordinate
     * @param y coordinate
     * @param pValue Value of the EmptyZone
     * @return The reference to the created EmptyZone
     * @pre Coordinates are inside the board
     */
    public EmptyZone createEmptyZone(int x, int y, String pValue) {
        assert x < aWidth && y < aHeight;
        if (!ALL_COORDINATES.containsKey(x)) {
            Map<Integer, Zone> map = new HashMap<>();
            map.put(y, new EmptyZone(pValue));
            ALL_COORDINATES.put(x, map);
        }
        else if (!ALL_COORDINATES.get(x).containsKey(y)) {
            ALL_COORDINATES.get(x).put(y, new EmptyZone(pValue));
        }
        return (EmptyZone)ALL_COORDINATES.get(x).get(y);
    }
    
    /**
     * @param x coordinate
     * @param y coordinate
     * @return The reference to the created MineZone
     * @pre Coordinates are inside the board
     */
    public MineZone createMineZone(int x, int y) {
        assert x < aWidth && y < aHeight;
        if (!ALL_COORDINATES.containsKey(x)) {
            Map<Integer, Zone> map = new HashMap<>();
            map.put(y, new MineZone());
            ALL_COORDINATES.put(x, map);
        }
        else if (!ALL_COORDINATES.get(x).containsKey(y)) {
            ALL_COORDINATES.get(x).put(y, new MineZone());
        }
        return (MineZone)ALL_COORDINATES.get(x).get(y);
    }

}
