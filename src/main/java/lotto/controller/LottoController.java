package lotto.controller;

import lotto.domain.LottoResult;
import lotto.domain.Lottos;
import lotto.domain.Money;
import lotto.domain.WinningLotto;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;
    private final LottoService lottoService;

    public LottoController(InputView inputView, OutputView outputView, LottoService lottoService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.lottoService = lottoService;
    }

    public void run() {
        Money amount = readPurchaseAmount();
        Lottos lottos = lottoService.buy(amount);
        outputView.printPurchasedLottos(lottos);

        WinningLotto winningNumbers = readWinningNumbers();
        LottoResult result = lottoService.calculateResult(lottos, winningNumbers);
        outputView.printResult(result, amount.getAmount());
    }

    private Money readPurchaseAmount() {
        while (true) {
            try {
                String input = inputView.readPurchaseAmount();
                return new Money(input);
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }

    private WinningLotto readWinningNumbers() {
        while (true) {
            try {
                String winning = inputView.readWinningNumbers();
                String bonus = inputView.readBonusNumber();
                return WinningLotto.from(winning, bonus);
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }
}
