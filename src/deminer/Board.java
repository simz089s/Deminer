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
     * @param pValue Value of the Zone
     * @return The reference to the created Zone
     * @pre Coordinates are inside the board
     */
    public Zone createZone(int x, int y, int pValue) {
        assert x < aWidth && y < aHeight;
        if (!ALL_COORDINATES.containsKey(x)) {
            ALL_COORDINATES.put(x, new HashMap<>(y, pValue));
        }
        else if (!ALL_COORDINATES.get(x).containsKey(y)) {
            ALL_COORDINATES.get(x).put(y, pValue);
        }
        return ALL_COORDINATES.get(x).get(y);
    }

}