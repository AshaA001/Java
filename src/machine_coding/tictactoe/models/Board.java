package machine_coding.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;

    public List<List<Cell>> getCell() {
        return cells;
    }

    public void setCell(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Board(int n) {
        this.cells = new ArrayList<>();
        for(int i=0;i<n;i++){
            this.cells.add(new ArrayList<>(n));
        }
    }
}
