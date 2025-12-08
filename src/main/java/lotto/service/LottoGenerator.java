package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;

import java.util.List;
import java.util.stream.Collectors;

public class LottoGenerator {

    public Lotto generate() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6)
                .stream()
                .sorted()
                .collect(Collectors.toList());
        return new Lotto(numbers);
    }
}
