package deminer;

import javafx.scene.control.Button;

/**
 * EmptyZone
 */
public class EmptyZone extends Button implements Zone {

    private final String aValue;
    private boolean hidden = false;
    
    public EmptyZone(String pValue) {
        aValue = pValue;
    }
    
    public EmptyZone(int pValue) {
        aValue = "" + pValue;
    }
    
    public int getValueInt() {
        return Integer.parseInt(this.getValue());
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
