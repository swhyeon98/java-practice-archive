package level1.pg_12982.budget;

import java.util.Arrays;

/**
 * TODO
 * 1) 입력:
 *    int[] d = {1, 3, 2, 5, 4}
 *    int budget = 9
 *
 * 2) 출력:
 *    3
 *
 * 3) 해야 할 일:
 *    1. 최대한 많은 부서를 지원해야 함
 *    2. 작은 금액부터 지원하는 것이 유리
 *    3. 배열을 오름차순 정렬
 *    4. 예산이 현재 부서 금액보다 크거나 같으면 지원
 *    5. 예산 차감 후 지원 부서 수 증가
 *    6. 예산이 부족하면 종료
 *
 * 4) 처리 순서:
 *    배열 정렬 ->
 *    배열 순회 ->
 *    현재 부서 금액 확인 ->
 *    예산으로 지원 가능한지 확인 ->
 *    가능하면:
 *        budget 차감
 *        answer 증가
 *    불가능하면:
 *        반복 종료 ->
 *    최종 지원 부서 수 반환
 */

public class Solution {
    public static void main(String[] args) {

    }

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for (int cost : d) {
            if (budget < cost) {
                break;
            }
            budget -= cost;
            answer++;
        }

        return answer;
    }
}
