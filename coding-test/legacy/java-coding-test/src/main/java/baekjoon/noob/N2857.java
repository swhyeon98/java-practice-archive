package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class N2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> intelligence = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            intelligence.add(br.readLine());
        }

        for (String word : intelligence) {
            if (word.contains("FBI")) {
                System.out.print(intelligence.indexOf(word) + 1 + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
