package self.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            String[] s = br.readLine().split(" ");

            char[] charArray = s[1].toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < charArray.length; j++) {
                for (int k = 0; k < Integer.parseInt(s[0]); k++) {
                    sb.append(charArray[j]);
                }
            }

            System.out.println(sb);
        }

        // 다른 방식으로 풀이
        /*for (int i = 0; i < repeat; i++) {
            String[] s = br.readLine().split(" ");

            char[] charArray = s[1].toCharArray();

            for (char c : charArray) {
                System.out.print((c + "").repeat(Integer.parseInt(s[0])));
            }

            System.out.println();
        }*/

    }
}
