package lotto;

import lotto.controller.LottoController;
import lotto.service.LottoGenerator;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {
        LottoController controller = createController();
        controller.run();
    }

    private static LottoController createController() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        LottoService lottoService = new LottoService(new LottoGenerator());
        return new LottoController(inputView, outputView, lottoService);
    }
}
