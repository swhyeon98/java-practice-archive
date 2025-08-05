package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Application {

    private static final List<String> DEFAULT_DELIMITERS = Arrays.asList(",", ":");

    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        List<String> delimiter = new ArrayList<>(DEFAULT_DELIMITERS);

        if (isEmptyInput(input)) {
            System.out.println("결과 : 0");
            return;
        }

        input = applyCustomDelimiterIfPresent(input, delimiter);

        List<String> numbers = splitNumbersByDelimiters(input, delimiter);

        validateNumericStrings(numbers);

        int result = numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("결과 : " + result);
    }

    private static boolean isEmptyInput(String input) {
        return input == null || input.trim().isEmpty();
    }

    private static String applyCustomDelimiterIfPresent(String input, List<String> delimiter) {
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
        return input;
    }

    private static List<String> splitNumbersByDelimiters(String input, List<String> delimiters) {
        String regex = String.join("|", delimiters.stream()
                .map(Pattern::quote)
                .toArray(String[]::new));
        return Arrays.asList(input.split(regex));
    }

    private static void validateNumericStrings(List<String> tokens) {
        for (String token : tokens) {
            if (!token.chars().allMatch(Character::isDigit)) {
                throw new IllegalArgumentException("잘못된 입력입니다: " + token);
            }
        }
    }
}
