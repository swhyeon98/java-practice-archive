package level0.pg_120956;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String s : babbling) {
            s = s.replaceAll("aya|ye|woo|ma", "");
            if(s.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
