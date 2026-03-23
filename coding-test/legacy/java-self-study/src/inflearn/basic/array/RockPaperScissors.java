package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] userA = br.readLine().split(" ");
        String[] userB = br.readLine().split(" ");

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(userA[i]);
            int b = Integer.parseInt(userB[i]);

            if (a == b) {
                System.out.println("D");
            } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
