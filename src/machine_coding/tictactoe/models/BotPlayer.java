package machine_coding.tictactoe.models;

public class BotPlayer extends Player {

    private BotLevel botLevel;
    public BotPlayer(String name, Symbol s, BotLevel b) {
        super(name, s);
        this.botLevel = b;
    }
}
