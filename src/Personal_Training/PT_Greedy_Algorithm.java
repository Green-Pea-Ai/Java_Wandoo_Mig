package Personal_Training;

import java.util.Scanner;

public class PT_Greedy_Algorithm {
    public static int wd_price;
    public static int wd_count;

    // coin 배열을 만든다.
    public static int[] coinArr = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 물건 값을 계산하는 점원이 있다.
        // 손님이 천원을 줬고 물건값(스캐너값)이 wd_price일 경우
        // 손님에게 줄수있는 거스름돈 동전 수의 최소 개수는 몇 개일까?

        // sc값 500원을 입력하면 1이 나온다. (500)
        // sc값 320원을 입력하면 6이 나온다. (500, 100, 50, 10x3)
        System.out.println("손님이 구매한 물품의 가격(원): ");
        wd_price = 1000 - sc.nextInt();

        // 향상된 for문
        for(int jd_coin:coinArr) {
            getCount(jd_coin);
        }

        System.out.println(wd_count);
    }

    public static void getCount(int wd_coin) {
        wd_count += (wd_price / wd_coin);
        wd_price = wd_price - (wd_coin * (wd_price / wd_coin));
    }
}
