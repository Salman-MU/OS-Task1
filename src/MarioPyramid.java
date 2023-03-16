import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarioPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int n = scanner.nextInt();
        var pyramid = buildPyramid(n);
        printPyramid(pyramid);

    }

    static List<String> buildPyramid(int n) {
        ArrayList<String> pyramid = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pyramid.add("*".repeat(Math.max(0, i)));
        }

        return pyramid;
    }

    static void printPyramid(List<String> pyramid) {
        for (String row : pyramid) {
            System.out.println(row);
        }
    }
}
