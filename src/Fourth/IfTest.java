package Fourth;

import java.util.Scanner;

// 파이썬 수업 중 헷갈리는 개념이 있어 강사님께서
// 잠시 자바로 진행한 수업
public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int num = scan.nextInt();

        // num이 80보다 크냐?
        if(num >= 80) {
            System.out.println("B");

        // num은 80보다 작다.
        // + num은 90보다 크거나 같다.
        // 위 두개의 조건을 만족하는 숫자는 없다.
        } else if(num >= 90) {
            System.out.println("A");
        }
        // 85를 입력하면 B가 나온다 (올바른 동작)
        // 95를 입력해도 B가 나온다 (잘못된 동작)
    }
}
