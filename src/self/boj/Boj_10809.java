package self.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print(s.indexOf(i) + " ");
        }
    }
}
