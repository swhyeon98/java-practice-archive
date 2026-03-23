package book.doit.datastructure;

import java.util.Scanner;

public class Baek1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String scores = scanner.nextLine();
        String[] split = scores.split(" ");

        int max = 0;
        int total = 0;
        for (String s : split) {
            int score = Integer.parseInt(s);
            if (score > max) {
                max = score;
            }
            total += score;
        }

        System.out.println("total = " + total * 100.0 / max / count);
    }
}
