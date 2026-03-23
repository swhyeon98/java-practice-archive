package inflearn.basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");
        String reversInput = new StringBuilder(input).reverse().toString();

        System.out.println(input.equals(reversInput) ? "YES" : "NO");
    }
}
