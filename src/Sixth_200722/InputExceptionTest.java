package Sixth_200722;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);

        // 짬이 차면 라이브러리를 만들어야 한다.
        // 그때 트라이캐치를 잘 써줘야 한다.
        System.out.println("나이를 입력하세요: ");

        try {
            i = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("정수를 입력하세요!");
        }
        System.out.println("왓 더");
    }
}
