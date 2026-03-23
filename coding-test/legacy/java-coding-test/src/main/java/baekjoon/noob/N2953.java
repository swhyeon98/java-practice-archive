package baekjoon.noob;

import java.util.Scanner;

public class N2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int max = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                sum += score;
                if (max <= sum) {
                    max = sum;
                    index = i;
                }
            }
        }
        System.out.println(index + " " + max);
    }
}
