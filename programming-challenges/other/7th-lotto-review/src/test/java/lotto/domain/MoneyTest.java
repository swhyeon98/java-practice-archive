package lotto.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class MoneyTest {

    @ParameterizedTest
    @ValueSource(strings = {"900", "0", "-1000"})
    void 구입_금액은_1000원_단위의_양의_정수여야_한다(String input) {
        assertThatThrownBy(() -> new Money(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 구입 금액은 1,000원 이상이어야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1500", "2300", "1530003"})
    void 구입_금액이_1000원으로_나누어_떨어지지_않는_경우_예외가_발생한다(String input) {
        assertThatThrownBy(() -> new Money(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 구입 금액은 1,000원 단위여야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", " ", ""})
    void 숫자가_아닌_값_공백_빈_문자열_입력_시_예외가_발생한다(String input) {
        assertThatThrownBy(() -> new Money(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 구입 금액은 숫자여야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1000", "2000", "150000"})
    void 정상적인_금액_입력_시_구매_가능한_로또_개수를_계산한다(String input) {
        // given
        Money money = new Money(input);

        // when
        int amount = money.getAmount();
        int lottoCount = money.getLottoCount();

        // then
        int expectedAmount = Integer.parseInt(input);
        int expectedLottoCount = expectedAmount / 1000;

        assertThat(amount).isEqualTo(expectedAmount);
        assertThat(lottoCount).isEqualTo(expectedLottoCount);
    }
}