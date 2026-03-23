package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N22966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String str ="";
        int a = 4;

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str2 = st.nextToken();
            int a2 = Integer.parseInt(st.nextToken());
            if(a>a2){
                a = a2;
                str = str2;
            }
        }
        System.out.println(str);
    }
}
