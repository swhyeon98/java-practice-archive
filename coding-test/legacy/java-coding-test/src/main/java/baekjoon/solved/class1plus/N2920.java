package baekjoon.solved.class1plus;

import java.util.Scanner;

public class N2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ascending = 0;
        int descending = 0;
        int des = 8;

        for (int i = 1; i <= 8; i++, des--) {
            int num = scanner.nextInt();
            if (i == num) {
                ascending++;
            } else if (des == num) {
                descending++;
            }
        }

        if (ascending == 8) {
            System.out.println("ascending");
        } else if (descending == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
