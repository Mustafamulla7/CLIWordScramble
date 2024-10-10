import java.util.Scanner;

public class WordScrambleGame {
    private String originalWord;
    private String scrambledWord;
    private WordBank wordBank;
    private String difficulty;
    private int score;

    public WordScrambleGame(String difficulty) {
        this.wordBank = new WordBank();
        this.difficulty = difficulty;
        this.score = 0;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            originalWord = wordBank.getRandomWord(difficulty);
            scrambledWord = Scrambler.scrambleWord(originalWord);

            System.out.println("Scrambled word: " + scrambledWord);
            System.out.print("Your guess: ");
            String guess = scanner.nextLine();

            if (checkGuess(guess)) {
                System.out.println("Congratulations! You guessed the correct word.");
                score++;
            } else {
                System.out.println("Sorry, that's not correct. The correct word was: " + originalWord);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().trim().toLowerCase();
            playAgain = playAgainInput.equals("yes");

        } while (playAgain);

        System.out.println("Your final score is: " + score);
        scanner.close();
    }

    private boolean checkGuess(String guess) {
        return guess.equalsIgnoreCase(originalWord);
    }
}
