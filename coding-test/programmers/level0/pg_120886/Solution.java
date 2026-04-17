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
        int[] beforeCount = new int[26];
        int[] afterCount = new int[26];

        for (int i = 0; i < before.length(); i++) {
            beforeCount[before.charAt(i) - 'a']++;
            afterCount[after.charAt(i) - 'a']++;
        }

        return Arrays.equals(beforeCount, afterCount) ? 1 : 0;
    }
}
