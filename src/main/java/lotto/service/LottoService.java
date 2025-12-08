package lotto.service;

import lotto.domain.*;

import java.util.ArrayList;
import java.util.List;

public class LottoService {

    private final LottoGenerator generator;

    public LottoService(LottoGenerator generator) {
        this.generator = generator;
    }

    public Lottos buy(Money amount) {
        int count = amount.getLottoCount();
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lottos.add(generator.generate());
        }
        return new Lottos(lottos);
    }

    public LottoResult calculateResult(Lottos lottos, WinningLotto winningNumbers) {
        LottoResult result = new LottoResult();
        for (Lotto lotto : lottos.getValues()) {
            Rank rank = winningNumbers.match(lotto);
            result.add(rank);
        }
        return result;
    }
}
