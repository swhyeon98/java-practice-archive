package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class N2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> wood = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < wood.size(); i++) {
            for (int j = 0; j < wood.size() - 1; j++) {
                if (wood.get(j) > wood.get(j + 1)) {
                    Collections.swap(wood, j, j + 1);
                    for (int k = 0; k < wood.size(); k++) {
                        System.out.print(wood.get(k) + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}