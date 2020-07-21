package Third;

class Vehicle {

    //내부에 있는 애들은 private에 접근할 수 있다.
    private String color;
    private String name;
    private float speed;

    // 생성자(Constructor)
    // 생성자는 클래스 내부의 변수와
    // 클래스 내부의 메서드를 사용할 수 있도록
    // 메모리에 배치하는 작업을 수행한다.
    // (우리가 컴퓨터에서 사용하는 모든 데이터는
    // 반드시 메모리 상에 올라가야만 작동한다)
    public Vehicle() {
        System.out.println("뭐시 ?");
    }

    // 자바의 경우 매서드의 이름이 같더라도
    // 입력(파라미터)의 개수가 다르면
    // 얼마든지 여러개를 선언할 수 있다.
    public Vehicle(String n, String c, float s) {
        System.out.println("난 여기야");
        name = n;
        color = c;
        speed = s;
    }

    // 자동 완성으로 getter를 만들었다.
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public float getSpeed() {
        return speed;
    }

}

class ThirdProblem_Type2 {

    private int start;
    private int end;

    public ThirdProblem_Type2 ( int a, int b) {

        start = a;
        end = b;

    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void findEven() {
        int idx;
        int cnt = 0;

        for(idx = start; idx <= end; idx++) {
            // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
            // if문은 2의 배수
            if(idx % 2 == 0) {
                System.out.println("------------A");
                cnt = cnt + idx;
                System.out.println("cnt : " + cnt);
                System.out.println("idx : " + idx);
            }
        }
    }

}

// 생성자
public class ThirdConstruct {

    public static void main(String[] args) {
        // 최소 알아야 하는 메모리 섹션 4개
        // Text | Data | Heap | Stack
        // new를 할 경우엔 메모리가 Heap에 잡힌다. 언제어디서든 접근 가능
        // 그 외의 것들은 메모리가 Stack에 잡힌다. 접근에 어려움이 있음(중괄호 끝나면 데이터 소실?)
        // Stack > for문 안에 쓰는 i 등의 변수가 그 예이다.
        // 스레드 프로그래밍 등 최적화를 하려면 스택, 힙의 개념을 잘 알고 있어야함.
        // 뉴텍스 세마커?
        Vehicle v1 = new Vehicle();

        // class 작성시 원칙
        // 1. 캡슐화
        // 2. 정보 은닉
        // 데이터를 덮어씌워 버릴 수 있다.
        // private를 써버리면 이렇게 쓸 수 없다(애초에 좋지않은 방법임)
        /*
        v1.color = "색상";
        v1.speed = 30.3f;
        v1.name = "포르쉐 052";
        */

        // 생성자를 통해서
        // 클래스 내부의 데이터를 설정할 수 있다.
        // 즉 이런 경우엔 setter가 전혀 필요 없다.
        Vehicle v2 = new Vehicle(
                "포르쉐 918", "파랑", 210.7f
        );

        System.out.println(v2.getColor());
        System.out.println(v2.getSpeed());
        System.out.println(v2.getName());

        ThirdProblem_Type2 tp2 = new ThirdProblem_Type2( 10, 20 );

        System.out.println(tp2.getStart());
        System.out.println(tp2.getEnd());
        //System.out.println("짝수의합 : " + tp2.findEven());

        System.out.println("오전11:05");
    }

}

// 문제. 1 ~ 20까지 숫자중
//      짝수들의 합을 산출하는 메서드를
//      클래스 내부에 구현해보도록 한다.
//      (이번에는 setter 없애고 생성자를 작성해보자 ~)
// 지레 겁먹지 말고 단계단계 해보고 틀리면 수정하면서 진행하자