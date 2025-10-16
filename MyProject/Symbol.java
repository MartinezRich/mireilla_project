public enum Symbol {
    ROCK, PAPER, SCISSORS;

    public GameResult getResult(Symbol other) {
        if (this == other) {
            return GameResult.DRAW;
        }
        switch(this) {
            case ROCK:
                return other == SCISSORS ? GameResult.WIN: GameResult.LOSE;
            case SCISSORS:
                return other == PAPER ? GameResult.WIN: GameResult.LOSE;
            case PAPER:
                return other == ROCK ? GameResult.WIN: GameResult.LOSE;
            default:
                return GameResult.DRAW;
        }
    }
}


