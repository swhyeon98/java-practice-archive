package inflearn.basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> input = new LinkedHashSet<>(Arrays.asList(br.readLine().split("")));

        StringBuilder sb = new StringBuilder();
        for (String s : input) {
            sb.append(s);
        }

        System.out.println(sb);
    }
}
