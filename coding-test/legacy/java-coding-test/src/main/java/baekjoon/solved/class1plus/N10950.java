package baekjoon.solved.class1plus;

import java.util.Scanner;

public class N10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
