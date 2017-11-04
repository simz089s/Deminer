package deminer;

/**
 * EmptyZone
 */
public class EmptyZone extends Zone {

    public EmptyZone(String pValue) {
        super(pValue);
    }
    
    public EmptyZone(int pValue) {
        super(""+pValue);
    }
    
    public int getValueInt() {
        return Integer.parseInt(this.getValue());
    }
    
}
