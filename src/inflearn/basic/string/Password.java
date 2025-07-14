package inflearn.basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String password = br.readLine();
        String result = "";

        for (int i = 0; i < count; i++) {
            String binary = "";
            for (int j = 0; j < 7; j++) {
                if (password.charAt(i * 7 + j) == '#') {
                    binary += "1";
                } else if (password.charAt(i * 7 + j) == '*') {
                    binary += "0";
                }
                if (binary.length() == 7) {
                    int binaryToDecimal = Integer.parseInt(binary, 2);
                    result += (char) binaryToDecimal;
                }
            }
        }

        System.out.println(result);
    }
}
