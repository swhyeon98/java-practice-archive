package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        List<String> words = Arrays.stream(br.readLine().split(" "))
//                .collect(Collectors.toList());
//
//        words.removeAll(Arrays.asList("", null));
//
//        System.out.println(words.size());

        String[] words = br.readLine().split(" ");
        int blankCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")){
                blankCount++;
            }
        }

        System.out.println(words.length - blankCount);
    }
}
