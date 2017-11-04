package deminer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

/**
 * EmptyZone
 */
public class EmptyZone extends ToggleButton implements Zone {

    private final String aValue;
    private boolean hidden = false;
    
    public EmptyZone(String pValue) {
        aValue = pValue;
        
//        this.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                this.setText(aValue);
//            }
//        });
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
