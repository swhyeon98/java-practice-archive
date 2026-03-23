package baekjoon.solved.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2920_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String cMajorScale = bufferedReader.readLine();

        if (cMajorScale.equals("1 2 3 4 5 6 7 8")) {
            System.out.println("ascending");
        } else if (cMajorScale.equals("8 7 6 5 4 3 2 1")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
