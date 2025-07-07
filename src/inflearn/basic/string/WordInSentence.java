package inflearn.basic.string;

import java.util.*;

public class WordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(scanner.next());
            stringBuilder.reverse();
            System.out.println(stringBuilder);
        }
    }
}
