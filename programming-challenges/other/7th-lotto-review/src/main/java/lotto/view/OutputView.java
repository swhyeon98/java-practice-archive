package lotto.view;

import lotto.domain.*;

import java.util.List;

public class OutputView {

    public void printPurchasedLottos(Lottos lottos) {
        System.out.println();
        System.out.println(lottos.size() + "개를 구매했습니다.");
        for (Lotto lotto : lottos.getValues()) {
            printLotto(lotto);
        }
        System.out.println();
    }

    private void printLotto(Lotto lotto) {
        List<Integer> numbers = lotto.getNumbers();
        System.out.println(numbers);
    }

    public void printResult(LottoResult result, int purchaseAmount) {
        System.out.println("당첨 통계");
        System.out.println("---");
        printRankLine(result, Rank.FIFTH, "3개 일치 (5,000원)");
        printRankLine(result, Rank.FOURTH, "4개 일치 (50,000원)");
        printRankLine(result, Rank.THIRD, "5개 일치 (1,500,000원)");
        printRankLine(result, Rank.SECOND, "5개 일치, 보너스 볼 일치 (30,000,000원)");
        printRankLine(result, Rank.FIRST, "6개 일치 (2,000,000,000원)");

        double yield = result.calculateYield(purchaseAmount);
        System.out.printf("총 수익률은 %.1f%%입니다.%n", yield);
    }

    private void printRankLine(LottoResult result, Rank rank, String message) {
        System.out.println(message + " - " + result.getCount(rank) + "개");
    }

    public void printError(String message) {
        System.out.println(message);
    }
}
