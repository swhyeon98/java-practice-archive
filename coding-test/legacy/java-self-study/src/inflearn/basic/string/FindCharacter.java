package inflearn.basic.string;

import java.util.Scanner;

public class FindCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        char findCharacter = scanner.next().toUpperCase().charAt(0);
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (findCharacter == input.charAt(i)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
