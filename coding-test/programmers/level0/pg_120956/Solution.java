package level0.pg_120956;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String regex = "^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$";

        for (String s : babbling) {
            if (s.matches(regex)) {
                answer++;
            }
        }
        return answer;
    }
}
