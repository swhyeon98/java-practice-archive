package level1.pg_12909.parentheses;

/**
 * TODO
 * 1) 입력:
 *    String s = "()()"
 * 2) 출력:
 *  true
 * 3) 해야 할 일:
 *  1. '(' 가 나오면 개수 증가
 *  2. ')' 가 나오면 개수 감소
 *  3. 중간에 개수가 음수가 되면 false
 *      -> 닫는 괄호가 더 많다는 뜻
 *  4. 문자열 순회가 끝났을 때
 *      개수가 0이면 true
 *      아니면 false
 * 4) 처리 순서:
 *  문자열 순회 ->
 *  현재 문자가 '(' 인지 ')' 인지 확인 ->
 *  '(' 면 count++ ->
 *  ')' 면 count-- ->
 *  count < 0 이면 false 반환 ->
 *  끝까지 반복 ->
 *  count == 0 이면 true ->
 *  아니면 false
 */

public class Solution {
    public static void main(String[] args) {

    }

    boolean solution(String s) {
        int count = 0;
        int len = s.length();

        if (len % 2 != 0) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }

    /*boolean solution(String s) {
        int count = 0;
        int len = s.length();

        if (s.charAt(0) == ')') {
            return false;
        }

        if (len % 2 != 0) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }*/

    /*boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        char[] charArray = s.toCharArray();

        if (charArray[0] == ')') {
            return false;
        }

        for (char c : charArray) {
            if (c == '(') {
                count ++;
            } else {
                count --;
            }

            if (count < 0) {
                return false;
            }
        }

        if (count == 0) {
            return true;
        }
        return answer;
    }*/
}
