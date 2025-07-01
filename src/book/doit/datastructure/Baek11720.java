package book.doit.datastructure;

import java.util.Scanner;

public class Baek11720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String number = scanner.next();
        char[] charArray = number.toCharArray();

        int total = 0;
        for (char c : charArray) {
            total += c - '0';
        }

        System.out.println(total);
    }
}
