package bronze.bj_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** Todo
 *  1) 입력: 2
 *          3 ABC
 *          5 /HTP
 *  2) 출력: AAABBBCCC
 *          /////HHHHHTTTTTPPPPP
 *  3) 해야 할 일:
 *   1. 테스트 케이스 수 T를 입력받는다.
 *   2. 각 테스트케이스마다 반복 횟수 R과 문자열 S를 입력받는다.
 *   3. 문자열 S의 각 문자를 R번 반복해 새 문자열을 만든다.
 *   4. 각 결과를 줄바꿈하여 출력한다.
 *  4) 처리 순서:
 *     입력 -> 각 테스트케이스 반복 ->
 *     문자열의 각 문자 순회 ->
 *     각 문자를 R번 append ->
 *     한 줄 완성 후 개행 추가 ->
 *     전체 출력
 */


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    sb.append(word.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
