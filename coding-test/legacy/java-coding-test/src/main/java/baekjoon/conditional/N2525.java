package baekjoon.conditional;

import java.util.Scanner;

public class N2525 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int min = 60 * A + B;
        min += C;

        int hour = (min / 60) % 24;
        min %= 60;
        System.out.println(hour + " " + min);
    }
}
