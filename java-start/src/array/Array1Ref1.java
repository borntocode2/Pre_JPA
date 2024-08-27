package array;

import java.util.Scanner;

public class Array1Ref1 {
    public static void main(String[] args) {
        String[] str = new String[5];
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while(i<5)
        {
            str[i] = scanner.nextLine();
            i++;
        }
        i = 0;
        while(i<5)
        {
            System.out.println(str[i]);
            i++;
        }





    }
}
