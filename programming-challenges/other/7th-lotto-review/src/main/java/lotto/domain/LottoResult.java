package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class LottoResult {
    private final Map<Rank, Integer> counts = new EnumMap<>(Rank.class);

    public LottoResult() {
        for (Rank rank : Rank.values()) {
            counts.put(rank, 0);
        }
    }

    public void add(Rank rank) {
        counts.put(rank, counts.get(rank) + 1);
    }

    public int getCount(Rank rank) {
        return counts.get(rank);
    }

    public long totalPrize() {
        long sum = 0;
        for (Rank rank : Rank.values()) {
            sum += (long) rank.getPrize() * counts.get(rank);
        }
        return sum;
    }

    public double calculateYield(int purchaseAmount) {
        long totalPrize = totalPrize();
        if (purchaseAmount == 0) {
            return 0;
        }
        return (double) totalPrize / purchaseAmount * 100;
    }

    public Map<Rank, Integer> getCounts() {
        return Map.copyOf(counts);
    }
}
