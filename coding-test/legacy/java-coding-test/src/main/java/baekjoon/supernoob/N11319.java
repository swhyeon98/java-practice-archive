package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11319 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] check = {'A','E','I','O','U','a','e','i','o','u'};

        for(int i = 0; i<num; i++){
            String str = br.readLine();
            int a = 0;

            for (int j = 0; j<str.length(); j++){
                for(int k = 0; k<check.length; k++){
                    if(str.charAt(j)==check[k])
                        a++;
                }
            }
            System.out.println(str.replace(" ","").length()-a+" "+a);
        }
    }
}
