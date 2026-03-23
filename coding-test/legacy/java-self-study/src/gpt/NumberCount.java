package gpt;

import java.util.HashMap;
import java.util.Map;

public class NumberCount {

    public static void main(String[] args) {
        int[] number = {3, 1, 2, 3, 2, 1};

        System.out.println("counting() = " + counting(number));
    }

    private static Map counting(int[] numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 < numbers.length && (numbers[i] == numbers[i + 1])) {
                count++;
            } else {
                hashMap.put(numbers[i], count);
                count = 1;
            }
        }

        return hashMap;
    }
}
