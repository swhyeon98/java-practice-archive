package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");

        int strike = 0;
        int ball = 0;
        int gameControl = 0;

        while (gameControl != 2) {
            List<Integer> computer = new ArrayList<>();
            while (computer.size() < 3) {
                int randomNumber = Randoms.pickNumberInRange(1, 9);
                if (!computer.contains(randomNumber)) {
                    computer.add(randomNumber);
                }
            }

            while (true) {
                System.out.print("숫자를 입력해주세요 : ");
                String[] input = Console.readLine().split("");
                List<Integer> user = new ArrayList<>();

                if (input.length != 3) {
                    throw new IllegalArgumentException("3개 아님.");
                }

                for (String s : input) {
                    if (!s.chars().allMatch(Character::isDigit)) {
                        throw new IllegalArgumentException("숫자만 입력하세요.");
                    }
                }

                for (String s : input) {
                    user.add(Integer.valueOf(s));
                }

                for (int i = 0; i < computer.size(); i++) {
                    if (computer.get(i).equals(user.get(i))) {
                        strike++;
                    } else if (computer.contains(user.get(i))) {
                        ball++;
                    }
                }

                StringBuilder sb = new StringBuilder();

                if (ball > 0) {
                    sb.append(ball).append("볼");
                }

                if (strike > 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(strike).append("스트라이크");
                }

                if (sb.length() == 0) {
                    sb.append("낫싱");
                }

                System.out.println(sb.toString());

                if (strike == 3) {
                    strike = 0;
                    ball = 0;
                    break;
                }

                strike = 0;
                ball = 0;
            }

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            gameControl = Integer.parseInt(Console.readLine());
        }
    }

    private
}
