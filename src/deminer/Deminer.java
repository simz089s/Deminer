import deminer.Board;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Deminer {
    
    private final Board board;
    private final int difficulty;
    
    public Deminer(int pWidth, int pHeight, int pDifficulty) {
        board = new Board(pWidth, pHeight);
        difficulty = pDifficulty;
    }
    
}
