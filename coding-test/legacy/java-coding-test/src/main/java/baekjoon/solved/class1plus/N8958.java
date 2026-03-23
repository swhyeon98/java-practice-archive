package baekjoon.solved.class1plus;

import java.util.Scanner;

public class N8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int result = 0;
            int n = 1;
            String ox = scanner.next();
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    result += n;
                    n++;
                } else {
                    n = 1;
                }
            }
            System.out.println(result);
        }
    }
}
