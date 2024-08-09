package machine_coding.tictactoe.models;

import java.util.List;

public class Game {
    private Board board;
   // private int numOfPlayers;
    private List<Player> players;
 //   private int numOfBots;
    private GameStatus gameStatus;
    private int currentPlayerIdx;
    private List<Move> moves;

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public static GameBuilder setBuilder(){
        return new GameBuilder();
    }

    public static class GameBuilder{
        private Board board;
       // private int numOfPlayers;
        private List<Player> players;
       // private int numOfBots;
        private GameStatus gameStatus;
        private int currentPlayerIdx;
        private List<Move> moves;

        public GameBuilder setPlayer(List<Player> players){
            this.players = players;
            int n = players.size();
            this.board = new Board(n+1);
            return this;
        }

        public Game build(){
            int botCount = 0;
            return null;
        }
    }
}
