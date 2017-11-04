package deminer;

import java.util.HashMap;

/**
 * Board
 */
public class Board {

    private static final HashMap<int, int> ALL_COORDINATES = new HashMap<>();
    private static final HashMap<int, Zone> ALL_ZONES = new HashMap<>();

    private int aWidth;
    private int aHeight;

    private Board(int pWidth, int pHeight) {
        aWidth = pWidth;
        aHeight = pHeight;
    }

}