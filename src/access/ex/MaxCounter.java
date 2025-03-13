package access.ex;

public class MaxCounter {

    private int count = 0;
    private int maxCount;

    public MaxCounter(int maxCount) {
        this.maxCount = maxCount;
    }


    /**
     * [검증 후 실행 방식]
     * 1. 먼저 검증 로직을 실행한다.
     *    - count가 maxCount 이상이면 실행을 중단하고 메시지를 출력한다.
     * 2. 검증을 통과한 경우 실행 로직을 수행한다.
     *    - count 값을 증가시킨다.
     * <p>
     * 검증 실패 시 return으로 종료되므로, 실행 로직이 불필요하게 수행되지 않는다.
     * 이 방식은 코드의 흐름을 명확하게 해주고 가독성을 높이는 장점이 있다.
     */
    public void increment() {
        // 검증 로직
        if (count >= maxCount) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
