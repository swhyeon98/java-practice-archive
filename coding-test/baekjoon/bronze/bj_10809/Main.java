package bronze.bj_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Todo
 *  1) 입력: baekjoon
 *  2) 출력: 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 *  3) 해야 할 일:
 *   1. 알파벳 소문자로만 이루어진 단어 S를 입력받는다.
 *   2. 알파벳 26개를 담을 배열을 준비한다.
 *   3. 배열에 먼저 -1을 담는다.
 *   4. 문자열을 순차적으로 순회하며, 각 알파벳에 맞는 배열의 인덱스 번호에 위치를 넣는다. 단, 값이 존재한다면 넘어간다.
 *   5. 각 결과를 출력한다.
 *  4) 처리 순서:
 *     입력 -> 배열 준비 ->
 *     빈 배열에 -1 값 넣기 ->
 *     문자열의 각 문자 순회 ->
 *     인덱스 번호에 문자 위치 넣기 ->
 *     전체 출력
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            int flag = input.charAt(i) - 'a';
            if (alphabet[flag] == -1) {
                alphabet[flag] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
