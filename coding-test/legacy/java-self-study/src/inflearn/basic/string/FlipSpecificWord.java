package inflearn.basic.string;

import java.util.Scanner;

public class FlipSpecificWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();

        int lt = 0;
        int rt = arr.length - 1;

        while (lt < rt) {
            if (!Character.isLetter(arr[lt])) {
                lt++;
            } else if (!Character.isLetter(arr[rt])) {
                rt--;
            } else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;

                lt++;
                rt--;
            }
        }

        System.out.println(arr);
    }
}
