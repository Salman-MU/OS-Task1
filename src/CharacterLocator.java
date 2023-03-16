import java.util.ArrayList;
import java.util.List;

public class CharacterLocator {

    List<Integer> locate(String word, char character) {
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                indices.add(i);
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        // Testing CharacterLocator

        var locator = new CharacterLocator();

        System.out.println(
                locator.locate(
                        "This is Javascript",
                        'i'
                )
        );
    }
}
