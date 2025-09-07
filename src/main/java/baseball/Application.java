package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final String INVALID_INPUT_MSG = "입력은 1~9의 서로 다른 숫자 3자리여야 합니다.";

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        do {
            runGameOnce();
        } while (askRestartOrQuit() == 1);
    }

    private static List<Integer> generateSecret() {
        List<Integer> secret = new ArrayList<>();
        while (secret.size() < 3) {
            int n = Randoms.pickNumberInRange(1, 9);
            if (!secret.contains(n)) {
                secret.add(n);
            }
        }
        return secret;
    }

    private static String readGuess() {
        return Console.readLine();
    }

    private static void validateGuess(String s) {
        if (s == null) throw new IllegalArgumentException(INVALID_INPUT_MSG);
        s = s.trim();
        if (s.length() != 3) throw new IllegalArgumentException(INVALID_INPUT_MSG);

        boolean[] seen = new boolean[10];
        for (int i = 0; i < 3; i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) throw new IllegalArgumentException(INVALID_INPUT_MSG);
            int d = c - '0';
            if (d == 0) throw new IllegalArgumentException(INVALID_INPUT_MSG);
            if (seen[d]) throw new IllegalArgumentException(INVALID_INPUT_MSG);
            seen[d] = true;
        }
    }

    private static List<Integer> parseGuess(String s) {
        s = s.trim();
        List<Integer> guess = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            guess.add(s.charAt(i) - '0');
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
        if (balls == 0 && strikes == 0) return "낫싱";
        if (balls > 0 && strikes > 0) return balls + "볼 " + strikes + "스트라이크";
        if (balls > 0) return balls + "볼";
        return strikes + "스트라이크";
    }

    private static boolean playTurn(List<Integer> secret) {
        System.out.print("숫자를 입력해주세요 : ");
        String raw = readGuess();
        validateGuess(raw);
        List<Integer> guess = parseGuess(raw);
        int[] result = judge(secret, guess);
        System.out.println(formatHint(result[0], result[1]));
        return result[1] == 3;
    }

    private static void runGameOnce() {
        List<Integer> secret = generateSecret();
        while (!playTurn(secret)) { }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private static int askRestartOrQuit() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String raw = Console.readLine();
        int n;
        try {
            n = Integer.parseInt(raw.trim());
        } catch (Exception e) {
            throw new IllegalArgumentException("1 또는 2를 입력하세요.");
        }
        if (n != 1 && n != 2) throw new IllegalArgumentException("1 또는 2를 입력하세요.");
        return n;
    }
}
