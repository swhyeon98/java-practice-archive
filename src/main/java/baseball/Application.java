package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        do {
            runGameOnce();
        } while (askRestartOrQuit() == 1);
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

    private static int[] judge(List<Integer> secret, List<Integer> guess) {
        int balls = 0, strikes = 0;
        for (int i = 0; i < 3; i++) {
            int g = guess.get(i);
            if (g == secret.get(i)) {
                strikes++;
            } else if (secret.contains(g)) {
                balls++;
            }
        }
        return new int[]{balls, strikes};
    }

    private static String formatHint(int balls, int strikes) {
        if (balls == 0 && strikes == 0) {
            return "낫싱";
        }
        if (balls > 0 && strikes > 0) {
            return balls + "볼 " + strikes + "스트라이크";
        }
        if (balls > 0) {
            return balls + "볼";
        }
        return strikes + "스트라이크";
    }

    private static boolean playTurn(List<Integer> secret) {
        System.out.print("숫자를 입력해주세요 : ");
        String raw = Console.readLine();
        validateInput(raw);
        List<Integer> guess = parseInput(raw);
        int[] result = judge(secret, guess);
        String hint = formatHint(result[0], result[1]);
        System.out.println(hint);
        return result[1] == 3; // strike == 3
    }

    private static void runGameOnce() {
        List<Integer> secret = getComputer();
        while (!playTurn(secret)) { }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private static int askRestartOrQuit() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String raw = Console.readLine();
        int n;
        try {
            n = Integer.parseInt(raw);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("1 또는 2를 입력하세요.");
        }
        if (n != 1 && n != 2) {
            throw new IllegalArgumentException("1 또는 2를 입력하세요.");
        }
        return n;
    }
}
