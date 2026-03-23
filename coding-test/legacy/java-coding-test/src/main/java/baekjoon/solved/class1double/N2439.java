package baekjoon.solved.class1double;

import java.util.Scanner;

public class N2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {
            int blank = num - i;
            int star = i;
            for (int j = 0; j < blank; blank--) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
