package doit;

import java.util.Arrays;

public class IntervalsSum {
    public static void main(String[] args) {
        int[] arr = {15,13,10,7,3,12};
        int[] S = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            if (i==0) {
                S[i] = arr[i];
                continue;
            }
            S[i] = S[i-1] + arr[i];
            System.out.println("S = "+S[i] + ", arr = "+arr[i]);
        }

        System.out.println(Arrays.toString(S));
    }
}
