package level0.pg_120921;

public class Solution {
    public static void main(String[] args) {
        int solution = solution("apple", "elppa");
        System.out.println("solution = " + solution);
    }

    public static int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) {
            return answer;
        }

        for (int i = 0; i < A.length(); i++) {
            answer++;
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
            if (B.equals(A)) {
                return answer;
            }

        }

        if (A.length() == answer) {
            return -1;
        }

        return answer;
    }
}