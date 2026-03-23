package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class N17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int count = 1;

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        int max = numbers.get(N-1);

        for (int index = numbers.size()-2; index >= 0; index--) {
            if (numbers.get(index) > max) {
                count++;
                max = numbers.get(index);
            }
        }
//        Collections.reverse(numbers);
//        for (int i = 1; i < numbers.size(); i++) {
//            if (numbers.get(0) < numbers.get(i) && numbers.get(i) != numbers.get(i - 1)) {
//                count++;
//            }
//        }

        System.out.println(count);
    }
}
