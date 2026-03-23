package lotto.domain;

import java.util.List;

public class Lottos {

    private final List<Lotto> values;

    public Lottos(List<Lotto> values) {
        this.values = values;
    }

    public int size() {
        return values.size();
    }

    public List<Lotto> getValues() {
        return values;
    }
}
