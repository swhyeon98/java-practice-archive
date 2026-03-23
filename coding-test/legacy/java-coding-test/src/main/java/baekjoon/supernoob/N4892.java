package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,n1,n2,n3,n4,cnt=1;

//        while (true) {
//            n = Integer.parseInt(br.readLine());
//            n1 = 3*n;
//
//            if(n1%2 == 0)
//                n2= n1/2;
//             else
//                n2 = (n1+1)/2;
//
//            n3 = 3*n2;
//            n4 = n3/9;
//
//            if(n1%2==0)
//                n = 2*n4;
//            else
//                n = 2*n4+1;
//
//            System.out.println(cnt+". "+(n1%2==0?"even ":"odd ")+n4);
//            cnt++;
//
//        }

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n==0)
                break;

            System.out.println(cnt+". "+( n%2==0 ? "even " + (n = 3 * n/2 * 3 / 9) : "odd " + ((3 * n + 1) / 2 * 3 / 9)));
            cnt++;

//            if(n*3 % 2==0){
//                n = 3 * n/2 * 3 / 9;
//                System.out.println(cnt + ". even " + n);
//            } else {
//                n = (3 * n + 1) / 2 * 3 / 9;
//                System.out.println(cnt + ". odd " + n);
//            } cnt++;
        }
    }
}
