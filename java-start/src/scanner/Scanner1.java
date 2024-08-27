package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");

        String data = scanner.nextLine();

        System.out.println(data);

    }
}
