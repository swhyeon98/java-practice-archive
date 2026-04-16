package level0.pg_120890;

import java.util.Arrays;

/**
 * TODO
 * 1) 입력: int[] array = [3, 10, 28] n = 20
 * 2) 출력: 28
 * 3) 해야 할 일:
 *  1. 각 원소와 n의 거리 계산
 *  2. 최소 거리인지 비교
 *  3. 최소 거리가 같으면 더 작은 값 선택
 *  만약 18이 있다면 18의 gap = -8, 27이 있다면 27의 gap = 7인데
 * 4) 처리 순서:
 *    배열 순회 ->
 *    현재 값과 n의 거리 계산 ->
 *    기존 최소 거리보다 작으면 갱신 ->
 *    거리가 같으면 더 작은 값으로 갱신 ->
 *    끝까지 반복 ->
 *    정답 반환
 */
public class Solution {
    public static void main(String[] args) {
        int[] array = {22, 17, 17};
        int n = 25;
        int result = solution(array, n);

        System.out.println("result = " + result);
    }

    public static int solution(int[] array, int n) {
        int answer = array[0];
        int temp = Integer.MAX_VALUE;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int gap = array[i] - n;
            if (gap < 0) {
                gap *= -1;
            }
            if (array[i] == n) {
                answer = array[i];
                break;
            } else if (temp > gap) {
                answer = array[i];
                temp = gap;
            } else if (temp == gap) {
                if (answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
