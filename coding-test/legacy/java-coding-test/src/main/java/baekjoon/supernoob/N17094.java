package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int two = 0;
        int e = 0;
        String str = br.readLine();

        for (int i=0; i<num; i++) {
            if(str.charAt(i)=='2') two++;
            else e++;
        }
        if (two>e) System.out.println("2");
        else if (two<e) System.out.println("e");
        else System.out.println("yee");
    }
}
