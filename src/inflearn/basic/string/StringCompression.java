package inflearn.basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input += " ";
        String result = "";
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result += input.charAt(i);
                if (count > 1) {
                    result += String.valueOf(count);
                }
                count = 1;
            }
        }

        System.out.println(result);
    }
}
