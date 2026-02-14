package self.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] patterns = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String pattern : patterns) {
            input = input.replace(pattern, "*");
        }

        System.out.println(input.length());
    }
}
