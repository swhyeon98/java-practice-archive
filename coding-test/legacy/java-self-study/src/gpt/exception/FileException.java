package gpt.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileException {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("파일 경로를 입력하세요.");
        String input = scanner.nextLine();

        try {
            FileOutputStream output = new FileOutputStream(input);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        } finally {
            System.out.println("종료");
        }
    }
}
