package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int x=0; x<n; x++){
            int i = Integer.parseInt(br.readLine());
            System.out.printf("Pairs for %d: ",i);
            for (int y=1; y<i;y++){
                for(int z=1; z<i; z++){
                    if(y+z == i && y<z){
                        System.out.printf("%d %d",y,z);
                        if(z-2>y){
                            System.out.print(", ");
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class N5217 {
//
//    private static ArrayList<Integer> solveSumPairs(int target) {
//
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//
//        /* ------------------- INSERT CODE HERE ---------------------*/
//        for (int i=1; i<target; i++) {
//            for (int j=1; j<target; j++){
//                if(i+j==target && i<j){
//                    answer.add(i);
//                    answer.add(j);
//                }
//            }
//        }
//        /* -------------------- END OF INSERTION --------------------*/
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int numCases = sc.nextInt();
//
//        for(int n = 0; n < numCases; n++)
//        {
//            int target = sc.nextInt();
//
//            ArrayList<Integer> answer = solveSumPairs(target);
//
//            System.out.print("Pairs for "+target+": ");
//
//            for (int i = 0; i<answer.size(); i+=2 ) {
//                if (i>0)
//                    System.out.print(", ");
//                System.out.print(answer.get(i) + " " + answer.get(i+1));
//            }
//            System.out.println();
//        }
//    }
//}

