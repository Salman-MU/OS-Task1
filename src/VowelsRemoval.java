import java.util.ArrayList;
import java.util.List;

public class VowelsRemoval {

    private static final List<Character> vowels = new ArrayList<>(List.of(
            'a','o','e','i','y'
    ));


    String remove(String word) {
        StringBuilder newWordBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (!vowels.contains(word.toLowerCase().charAt(i))) {
                newWordBuilder.append(word.charAt(i));
            }
        }

        return newWordBuilder.toString();
    }

    List<String> removeAll(List<String> words) {
        ArrayList<String> newList = new ArrayList<>();

        for (String word : words) {
            newList.add(remove(word));
        }

        return newList;
    }
}

class Program {
    public static void main(String[] args) {
        var removal = new VowelsRemoval();

        var firstTest = "mobile";
        System.out.println(removal.remove(firstTest));


        var secondTest =  List.of("mobile", "Hello");

        System.out.println(
                removal.removeAll(secondTest)
        );
    }
}
