import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose difficulty level (easy, medium, hard): ");
        String difficulty = scanner.nextLine().trim().toLowerCase();

        if (!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")) {
            System.out.println("Invalid difficulty level. Defaulting to easy.");
            difficulty = "easy";
        }

        WordScrambleGame game = new WordScrambleGame(difficulty);
        game.startGame();
    }
}
