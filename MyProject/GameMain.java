import java.util.Scanner;


public class GameMain {
    public static void main(String[] args) {
        GamePlayer gameplayer = new GamePlayer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for rounds to play: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int humanWins = 0;
        int computerWins = 0;
        
        for (int i = 0; i < n; i++){
            String userInput = scanner.nextLine().toUpperCase();
            Symbol userSymbol;
            try {
                userSymbol = Symbol.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input");
                computerWins++;
                continue;
            }

            Symbol computerSymbol = gameplayer.getSymbol();
            GameResult userResult = userSymbol.getResult(computerSymbol);

            System.out.println("The result of computer: " + computerSymbol);
            System.out.println("The result of human: " + userSymbol);

            if (userResult == GameResult.WIN) {
                humanWins++;
            } else if (userResult == GameResult.LOSE) {
                computerWins++;
            }
        }
        System.out.println("the times that computer wins: " + computerWins);
        System.out.println("the times that human wins: " +  humanWins);
    }
}
