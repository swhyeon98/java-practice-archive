package inflearn.basic.string;

import java.util.Scanner;

public class LetterCaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String convertCaseUsingCharacter = convertCaseUsingCharacter(str);
        String convertCaseUsingAscii = convertCaseUsingAscii(str);
        String convertCaseUsingAsciiV2 = convertCaseUsingAsciiV2(str);

        System.out.println("convertCaseUsingCharacter = " + convertCaseUsingCharacter);
        System.out.println("convertCaseUsingAscii = " + convertCaseUsingAscii);
        System.out.println("convertCaseUsingAsciiV2 = " + convertCaseUsingAsciiV2);
    }

    private static String convertCaseUsingCharacter(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    private static String convertCaseUsingAscii(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                result.append((char) (c + 32));
            } else {
                result.append((char) (c - 32));
            }
        }
        return result.toString();
    }

    private static String convertCaseUsingAsciiV2(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
