import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Scrambler {

    public static String scrambleWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        StringBuilder scrambled = new StringBuilder();
        for (String letter : letters) {
            scrambled.append(letter);
        }
        return scrambled.toString();
    }
}
