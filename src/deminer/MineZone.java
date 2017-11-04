package deminer;

import javafx.scene.control.Button;

/**
 * MineZone
 */
public class MineZone extends Button implements Zone {
    
    private static final String VALUE = "M";
    private final String aValue = VALUE;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean hidden;
    
    public MineZone() {
        hidden = true;
    }
    
    @Override
    public String getValue() {
        return aValue;
    }
    
    @Override
    public boolean isHidden() {
        return hidden;
    }
    
    /**
     *
     * @param pHidden
     */
    @Override
    public void setHidden(boolean pHidden) {
        hidden = pHidden;
    }
    
}
