package access.ex;

public class MaxCounter {

    private int count;
    private int maxCount;

    public MaxCounter(int maxCount) {
        this.maxCount = maxCount;
    }

    public void increment() {
        if (maxCount > count) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
            count = maxCount;
        }
    }

    public int getCount() {
        return count;
    }
}
