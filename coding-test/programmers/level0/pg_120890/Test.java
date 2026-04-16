package level0.pg_120890;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();

        for (int t = 0; t < 10000; t++) {
            int size = r.nextInt(5) + 1;
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = r.nextInt(30) + 1;
            }

            int n = r.nextInt(30) + 1;

            int result1 = solution(arr.clone(), n); // 네 코드
            int result2 = correct(arr.clone(), n);  // 정답 코드

            if (result1 != result2) {
                System.out.println("틀린 케이스 발견!");
                System.out.println("array = " + Arrays.toString(arr));
                System.out.println("n = " + n);
                System.out.println("내 답 = " + result1);
                System.out.println("정답 = " + result2);
                break;
            }
        }
    }

    // 무조건 맞는 기준 로직 (힌트용)
    static int correct(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0] - n);

        for (int x : array) {
            int gap = Math.abs(x - n);

            if (gap < min || (gap == min && x < answer)) {
                min = gap;
                answer = x;
            }
        }
        return answer;
    }

    public static int solution(int[] array, int n) {
        int answer = array[0];
        int temp = Integer.MAX_VALUE;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {

            int gap = array[i] - n;
            if (gap < 0) {
                gap *= -1;
            }
            System.out.println("i=" + i + ", value=" + array[i] + ", gap=" + gap + ", temp=" + temp + ", answer=" + answer);
            if (temp > gap) {
                answer = array[i];
                temp = gap;
            } else if (temp == gap) {
                break;
            }
        }
        return answer;
    }
}
