package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculationScore {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int range = Integer.parseInt(br.readLine());
        String[] score = br.readLine().split(" ");
        int check = 0;
        int result = 0;

        for (int i = 0; i < range; i++) {
            if (score[i].equals("1")) {
                check ++;
                result += check;
            } else {
                check = 0;
            }
        }

        System.out.println(result);
    }
}
