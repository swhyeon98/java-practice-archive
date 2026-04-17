package level0.pg_120886;

import java.util.Arrays;

/**
 * TODO
 * 1) 매개변수: before = "olleh", after = "hello"
 * 2) 출력: 1
 * 3) 해야할 일:
 *  1. before 알파벳을 담을 배열과 after 알파벳을 담을 배열 생성한다.
 *  2. 각 배열에 알파벳을 저장한다.
 *  3. 각 배열의 index 안에 값이 전부 같다면 1 아니라면 0을 return한다.
 */

class Solution {
    public int solution(String before, String after) {
        char[] befores = new char[26];
        char[] afters = new char[26];
        int answer = 0;

        if (before.length() != after.length()) {
            return 0;
        }

        for (int i = 0; i < before.length(); i++) {
            befores[before.charAt(i) - 'a']++;
        }

        for (int i = 0; i < after.length(); i++) {
            afters[after.charAt(i) - 'a']++;
        }

        if (Arrays.equals(befores, afters)) {
            answer = 1;
        }

        return answer;
    }
}
