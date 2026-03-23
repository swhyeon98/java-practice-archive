package baekjoon.supernoob;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class N10093 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        long a = (long)Integer.parseInt(st.nextToken());
//        long b = (long)Integer.parseInt(st.nextToken());
//        long c = Math.max(a,b);
//        long d = Math.min(a,b);
//        long e = c-d-1>0?c-d-1:0;
//
//        System.out.println(e);
//
//        for (d+=1;d<c;d++){
//            if(e==0) break;
//            System.out.print(d+" ");
//        }
//    }
//}

import java.util.*;
public class N10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a>b){
            System.out.println(a-b-1);
            for (long i = b+1; i<a;i++)
                System.out.print(i+" ");
        }
        if (a<b){
            System.out.println(b-a-1);
            for (long i = a+1; i<b;i++)
                System.out.print(i+" ");
        }
        if (a==b){
            System.out.println(0);
        }
    }
}
