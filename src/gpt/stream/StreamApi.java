package gpt.stream;

import java.util.List;

public class StreamApi {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "avocado", "berry");
        int count = 0;
        for (String word : words) {
            if (word.startsWith("a")) {
                count++;
            }
        }

        System.out.println(count);

        long count1 = words.stream()
                .filter(word -> word.startsWith("a"))
                .count();

        System.out.println("count1 = " + count1);
    }
}
