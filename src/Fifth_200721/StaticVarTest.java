package Fifth_200721;

class StaticVar {
    // 메모리에 존재하는 섹션: 텍스트(기계어), 데이터(전역변수), 힙(new), 스택
    // static 키워드가 붙은 변수들은 데이터로 배치된다.
    // 즉 원래는 지역변수였을 staticNum에 대해
    // 전역변수화가 이루어진다.

    // 스레드가 돌아갔다면 크리티컬 섹션 발생
    // 뮤텍스, 세마포어로 락을 걸어준다.

    // 파이썬, 자바, c, c++ 모두 개념은 같다.
    // 한 언어만 빠삭 알면 다른 언어도 하기가 쉽다.
    static int staticNum = 0;

    public StaticVar () {
        // 동접자수 판단할 때 쓰면 좋음
        staticNum++;
        System.out.println("Num: " + staticNum);
    }
}

public class StaticVarTest {
    // 매서드에 static이 붙은 경우는 ?
    // 초기에 JVM이 구동되면서
    // 디폴트로 올려주는 매서드에는
    // static이 붙어있다.
    // static이 붙은 녀석들을
    // new 없이 사용할 수 있다.
    public static void main(String[] args) {
        StaticVar sv1 = new StaticVar();
        StaticVar sv2 = new StaticVar();
        StaticVar sv3 = new StaticVar();
    }

}
