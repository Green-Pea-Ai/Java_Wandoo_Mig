package Second;

// 클래스란 데이터와 데이터를 다루는 기능 집합(벗어나면 엔티티 오염됨)
// 클래스 작성법
// 1. class 적고 중괄호를 열고 닫는다.
// 2. 클래스의 이름을 작성한다.
//    클래스 작성시 규칙이 있는데
//    단어의 시작부분을
//    항상 대문자로 작성해주는 것이 좋다.
// 3. 클래스 내부에서 다룰 데이터를 작성한다.
// 4. 해당 데이터들을 다룰 수 있는 메서드를 작성한다.
class Person {
    // 데이터란 결국 클래스 내부에 있는 변수
    String name;
    int age;

    // Alt + insert : Getter & Setter
    // getter는 클래스 내부값을 가져오는데 사용
    // setter는 클래스 내부값을 설정하는데 사용
    // setter는 쓰지말라고 함?(엔티티 오염도가 높아짐)

    // 메서드를 작성하는 방법
    // 1. 리턴 타입을 적는다.
    // 2. 매서드의 이름을 적는다.
    // 3. 인자(파라미터) - 입력을 작성한다.
    // 4. 중괄호 내부에
    //     매서드가 수행하는 기능을 작성한다.
    //     기능이 뻔해서 자동완성으로 만들어두긴 함
    //오일러 함수? 딥러닝 연관해서 직접 겟셋을 손으로 써보는게 도움된다고 함

    // 리턴 타입 : String
    // 매서드의 이름: getName
    // 인자: 없음 - ()
    // 내부: return name
    // return하는 데이터의 데이터타입과
    // 위의 리턴 타입이 일치해야 한다.
    public String getName() {
        return name;
    }

    // 리턴 타입: int
    // 매서드 이름: getAge, 뭐하는 클래스인지 알 수 있게 클래스 이름을 직관적으로 쓰기
    // 내부: return age
    public int getAge() {
        return age;
    }

    // 리턴 타입: void(없음)
    // 매서드 이름: setName
    // 인자: String name
    // 내부: this.name = name
    // this는 자기 자신을 의미
    // (클래스 내부에 있는 name)이라는 것을 컴퓨터에게 알려줌
    // (컴퓨터는 명확히 기준을 안주면 인식을 못함)
    public void setName(String name) {
        // 클래스 내부의 name에
        // 입력으로 들어온 name을 넣으시오.
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }*/
}

public class SecondPerson {

    public static void main(String[] args) {
        System.out.println("클래스 이다");

        // Scanner scan = new Scanner(System.in);
        // 클래스 내부에 있는 데이터와
        // 매서드를 사용하기 위한 단계

        // 클래스는 커스텀하게 만들 수 있는 하나의 데이터 타입이다?
        // 내일은 생성자 수업함
        int    p2 = 3;
        Person p  = new Person();
        // 위의 두 코드를 보면
        // 결국 클래스는 사용자가 직접 만드는
        // 커스텀 데이터 타입이란 것을 상기할 수 있다.

        // .이 들어있으면 클래스 내부에 있는
        // 매서드를 사용하겠다라는 의미
        // Second.Person 클래스에 있는 setName을 동작시킨다.
        // p는 클래스 변수
        p.setName("test");
        p.setAge(33);

        // System도 클래스의 일종임, println을 쓸 수 있는 함수
        System.out.println("getter를 활용해 " + "클래스 내부 데이터를 가져옵니다.");
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }

}

// Second.숙제

// 1. Student 클래스 작성해보기
//      이름, 나이, 전공

// 2. Second.Vehicle 클래스 작성해보기
//      이름, 색상, 속도

// 3. 1 ~ 20까지 숫자중
//     짝수들의 합을 산출하는 매서드를
//     클래스 내부에 구현해보도록 한다.