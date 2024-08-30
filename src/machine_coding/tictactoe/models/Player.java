package machine_coding.tictactoe.models;

public abstract class Player {
    private String name;
    private Symbol s;

    public Player(String name, Symbol s) {
        this.name = name;
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getS() {
        return s;
    }

    public void setS(Symbol s) {
        this.s = s;
    }

}
