package lotto.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningLotto {

    private final Lotto winningNumbers;
    private final int bonusNumber;

    public WinningLotto(Lotto winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public static WinningLotto from(String winningInput, String bonusInput) {
        List<Integer> winningNumbers = parseWinningNumbers(winningInput);
        Lotto lotto = new Lotto(winningNumbers);
        int bonusNumber = parseBonusNumber(bonusInput);
        return new WinningLotto(lotto, bonusNumber);
    }

    private static List<Integer> parseWinningNumbers(String input) {
        try {
            return Arrays.stream(input.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호는 쉼표(,)로 구분된 숫자여야 합니다.");
        }
    }

    private static int parseBonusNumber(String input) {
        try {
            int bonus = Integer.parseInt(input);
            validateBonusRang(bonus);
            return bonus;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 숫자여야 합니다.");
        }
    }

    private static void validateBonusRang(int bonus) {
        if (bonus > 45 || bonus < 1) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }

    private void validateBonusNotDuplicated(Lotto winningNumbers, int bonusNumber) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 당첨 번호와 중복될 수 없습니다.");
        }
    }

    public Rank match(Lotto lotto) {
        int count = lotto.matchCount(winningNumbers);
        boolean bonusMatch = lotto.contains(bonusNumber);
        return Rank.of(count, bonusMatch);
    }
}
