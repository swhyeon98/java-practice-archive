package bronze.bj_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Todo
 *  1) 입력: 734 893
 *  2) 출력: 437
 *  3) 해야 할 일:
 *   1. 첫 줄에 두 수 A와 B를 입력받는다.
 *   2. StringTokenizer와 StringBuilder를 활용하여 각각의 변수(int)에 뒤집은 문자열을 정수로 변환한다.
 *   3. Math.max 활용하여 두 수 중에 큰 수를 찾는다.
 *   4. 결과를 출력한다.
 *  4) 처리 순서:
 *     입력 -> StringTokenizer, StringBuilder 준비 ->
 *     반대로 뒤집기 ->
 *     큰 수 찾기 ->
 *     출력
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
        int A = Integer.parseInt(sb.toString());
        sb = new StringBuilder(st.nextToken()).reverse();
        int B = Integer.parseInt(sb.toString());

        System.out.println(Math.max(A, B));
    }
}
