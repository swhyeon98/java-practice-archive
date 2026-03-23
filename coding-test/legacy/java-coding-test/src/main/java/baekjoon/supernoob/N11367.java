package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11367 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int grade = Integer.parseInt(st.nextToken());

            if(grade >= 97 && grade<=100){
                System.out.println(name+" A+");
            } else if(grade >= 90 && grade<= 96) {
                System.out.println(name + " A");
            } else if(grade >= 87 && grade<= 89) {
                System.out.println(name + " B+");
            } else if(grade >= 80 && grade<= 86) {
                System.out.println(name + " B");
            } else if(grade >= 77 && grade<=79) {
                System.out.println(name + " C+");
            } else if(grade >= 70 && grade<=76) {
                System.out.println(name + " C");
            } else if(grade >= 67 && grade<=69) {
                System.out.println(name + " D+");
            } else if(grade >= 60 && grade<=66) {
                System.out.println(name + " D");
            } else {
                System.out.println(name + " F");
            }
        }

    }
}
