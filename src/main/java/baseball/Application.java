package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    private static List<Integer> getComputer() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    private static void validateInput(String input) {
        if (input == null || input.length() != 3) {
            throw new IllegalArgumentException("입력은 정확히 3자리여야 합니다.");
        }

        boolean[] seen = new boolean[10]; // 0~9

        for (int i = 0; i < 3; i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("숫자만 입력하세요.");
            }

            int digit = c - '0';

            if (digit == 0) {
                throw new IllegalArgumentException("각 자리는 1~9이어야 합니다.");
            }

            if (seen[digit]) {
                throw new IllegalArgumentException("중복 없는 3자리 숫자를 입력하세요.");
            }
            seen[digit] = true;
        }
    }

    private static List<Integer> parseInput(String input) {
        List<Integer> guess = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            guess.add(input.charAt(i) - '0');
        }
        return guess;
    }
}
