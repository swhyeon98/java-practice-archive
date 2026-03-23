package baekjoon.solved.class1double;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N3052 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            set.add(scanner.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}
