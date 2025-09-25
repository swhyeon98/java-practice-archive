package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    private void validateNumbersInRange(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number > 45 || number < 0) {
                throw new IllegalArgumentException("[ERROR] 로또 번호의 범위는 1~45입니다.");
            }
        }
    }

    private void validateAllDistinct(List<Integer> numbers) {
        Set<Integer> unique = new HashSet<>(numbers);
        if (unique.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 서로 다른 6개여야 합니다.");
        }
    }
}
