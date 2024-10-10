import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordBank {
    private List<String> easyWords;
    private List<String> mediumWords;
    private List<String> hardWords;
    private Random random;

    public WordBank() {
        easyWords = new ArrayList<>();
        mediumWords = new ArrayList<>();
        hardWords = new ArrayList<>();
        random = new Random();

        // Add words to the lists
        easyWords.add("cat");
        easyWords.add("dog");
        easyWords.add("sun");
        easyWords.add("hat");
        easyWords.add("pen");
        easyWords.add("cup");
        easyWords.add("book");
        easyWords.add("fish");
        easyWords.add("tree");
        easyWords.add("bird");
        
        mediumWords.add("apple");
        mediumWords.add("banana");
        mediumWords.add("orange");
        mediumWords.add("guitar");
        mediumWords.add("pencil");
        mediumWords.add("school");
        mediumWords.add("garden");
        mediumWords.add("window");
        mediumWords.add("summer");
        mediumWords.add("winter");

        hardWords.add("elephant");
        hardWords.add("giraffe");
        hardWords.add("hippopotamus");
        hardWords.add("chameleon");
        hardWords.add("encyclopedia");
        hardWords.add("architecture");
        hardWords.add("difficult");
        hardWords.add("knowledge");
        hardWords.add("university");
        hardWords.add("philosophy");
    }

    public String getRandomWord(String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "easy":
                return easyWords.get(random.nextInt(easyWords.size()));
            case "medium":
                return mediumWords.get(random.nextInt(mediumWords.size()));
            case "hard":
                return hardWords.get(random.nextInt(hardWords.size()));
            default:
                return null;
        }
    }
}
