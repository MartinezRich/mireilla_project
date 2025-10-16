import java.util.Random;


public class GamePlayer {
    private Random random = new Random();

    public Symbol getSymbol() {
        Symbol[] symbols = Symbol.values();
        return symbols[random.nextInt(symbols.length)];
    }
}
