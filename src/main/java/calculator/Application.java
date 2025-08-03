package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    private static final List<String> DEFAULT_DELIMITERS = Arrays.asList(",", ":");

    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        List<String> delimiter = new ArrayList<>(DEFAULT_DELIMITERS);

        if (input.isEmpty()) {
            System.out.println("결과 : 0");
            return;
        }

        if (input.startsWith("//")) {
            input = input.replace("\\n", "\n");
            int delimiterEndIndex = input.indexOf("\n");

            if (delimiterEndIndex != 3) {
                throw new IllegalArgumentException("커스텀 구분자 포맷이 잘못되었습니다.");
            }

            String customDelimiter = input.substring(2, delimiterEndIndex);

            delimiter.add(customDelimiter);

            input = input.substring(delimiterEndIndex + 1);
        }

        List<String> numbers = Arrays.asList(input.split(String.valueOf(delimiter)));

        for (String number : numbers) {
            if (!number.chars().allMatch(Character::isDigit)) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }

        int result = numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("결과 : " + result);
    }
}
