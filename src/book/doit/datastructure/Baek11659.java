package book.doit.datastructure;

import java.util.Scanner;

public class Baek11659 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int count = Integer.parseInt(input[0]);
        int[] numbers = new int[count + 1];

        for (int i = 1; i <= count; i++) {
            numbers[i] = scanner.nextInt();
            numbers[i] += numbers[i - 1];
        }

        int line = Integer.parseInt(input[1]);
        scanner.nextLine();
        for (int i = 0; i < line; i++) {
            String[] range = scanner.nextLine().split(" ");
            int j = Integer.parseInt(range[0]);
            int k = Integer.parseInt(range[1]);

            System.out.println(numbers[k] - numbers[j - 1]);
        }
    }
}
