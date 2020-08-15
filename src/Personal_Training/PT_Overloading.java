package Personal_Training;

class WD_Overloading {
    void car() {
        System.out.println("자동차");
    }

    void car(int a, int b) {
        System.out.println("자동차의 속력 : " + a + "km, " + b + "km");
    }

    void car(String c) {
        System.out.println("자동차 이름 : " + c);
    }

}

public class PT_Overloading {
    public static void main(String[] args) {

        WD_Overloading ol = new WD_Overloading();

        ol.car();
        ol.car(100, 150);
        ol.car("자동차 이름을 입력하세요.");
    }
}
