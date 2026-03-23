package gpt;

import java.util.regex.Pattern;

public class ParenthesesValidation {

    public static void main(String[] args) {
        System.out.println(validateParentheses("())("));
        System.out.println(validateParentheses("(()"));
    }

    private static boolean validateParentheses(String str) {
        boolean isParentheses = false;
        int startCount = str.split(Pattern.quote("("), -1).length - 1;
        int endCount = str.split(Pattern.quote(")"), -1).length - 1;
        if (str.startsWith("(") && str.endsWith(")") && startCount == endCount) {
            isParentheses = true;
        }
        return isParentheses;
    }
}
