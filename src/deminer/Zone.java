package deminer;

import javafx.scene.control.Button;

/**
 * Zone interface
 */
public abstract class Zone extends Button {
    
    private final String aValue;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean aValueShown = false;

    public Zone(String pValue) {
        aValue = pValue;
    }
    
    public String getValue() {
        return aValue;
    }
    
    public boolean getShowValue() {
        return aValueShown;
    }
    
    public void setShowValue(boolean pValueShown) {
        aValueShown = pValueShown;
    }

}
