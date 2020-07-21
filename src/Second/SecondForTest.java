package Second;

public class SecondForTest {
    public static void main(String[] args) {
        System.out.println("For문에 익숙해지자!");

        // 1. 3 ~ 10까지 출력해보자!
        for(int i = 3; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");

        // 2. 10 ~ 20까지 출력해보자!
        for( int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------마지막");

        // 3. 5 ~ 10까지 출력하고
        //      그중 홀수들의 합을 구해보자!
        int sum = 0;

        for( int i = 5; i <= 10; i++) {
            //System.out.println(i);
            if(i % 2 == 1) {
                sum += i;
            }
           //여기에다 sout 쓰면 i 반복수만큼 반복 출력됨, 바깥으로 빼줘야 함
        }
        System.out.println("홀수의 합 : " + sum);
        //System.out.printf("홀수의 합 : " + sum);

        // println(), 출력 후 엔터
        // print(), 그냥 출력
        // printf(), 특정 형식으로 출력, 위의 println 안의 식처럼 그대로 못씀(해보니까 되긴함)
    }
}
