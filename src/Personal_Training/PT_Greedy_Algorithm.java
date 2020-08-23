/**
 * https://ko.wikipedia.org/wiki/%ED%83%90%EC%9A%95_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * 탐욕 알고리즘은 최적해를 구하는 데에 사용되는 근사적인 방법으로,
 * 여러 경우 중 하나를 결정해야 할 때마다 그 순간에 최적이라고 생각되는 것을 선택해 나가는 방식으로
 * 진행하여 최종적인 해답에 도달한다.
 * 순간마다 하는 선택은 그 순간에 대해 지역적으로는 최적이지만,
 * 그 선택들을 계속 수집하여 최종적(전역적)인 해답을 만들었다고 해서,
 * 그것이 최적이라는 보장은 없다.
 * 하지만 탐욕알고리즘을 적용할 수 있는 문제들은
 * 지역적으로 최적이면서 전역적으로 최적인 문제들이다.
 * */
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
        // jd_coin에 coinArr의 배열수만큼
        // getCount(jd_coin);를 반복 실행한다.
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
