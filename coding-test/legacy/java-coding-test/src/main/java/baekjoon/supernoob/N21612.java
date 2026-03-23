package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N21612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kPa = Integer.parseInt(br.readLine()) * 5 - 400;

        if (kPa < 100) System.out.print(kPa+"\n"+1);
        else if (kPa > 100) System.out.print(kPa+"\n"+-1);
        else System.out.print(kPa+"\n"+0);
    }
}
