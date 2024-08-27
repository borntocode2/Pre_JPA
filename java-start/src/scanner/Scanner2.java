package scanner;
import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
        {
            System.out.println(num1);
        }
        else if(num1 < num2){
            System.out.println(num2);
        }
        else {
            System.out.println("두 정수는 같은 정수입니다.");
        }
    }
}
