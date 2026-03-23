package inflearn.basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CharacterDistance {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] charArray = st.nextToken().toCharArray();

        char target = st.nextToken().charAt(0);
        int[] result = new int[charArray.length];

        int distance = 100;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == target) {
                distance = 0;
            } else {
                distance++;
            }
            result[i] = distance;
        }

        distance = 100;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == target) {
                distance = 0;
            } else {
                distance++;
            }
            result[i] = Math.min(result[i], distance);
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
