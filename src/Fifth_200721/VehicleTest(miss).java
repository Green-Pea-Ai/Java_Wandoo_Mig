/*

문제를 잘못 이해한듯하여 클래스 새로 만들어서 함

package Fifth_200721;


// 문제 1. Vehicle 클래스를 만든다.
//        그리고 Airplane과 Car 클래스를 만든다.
//        이때 Airplane과 Car는 Vehicle을 상속받는다.
//        내부 변수들을 출력할 수 있게 만들도록 한다.

class Airplane extends Vehicle {

    public Airplane(int speed, String color) {
        super(speed, color);
    }

    void ApColor() {
        super.color;
    }
}

class Car1 extends Vehicle {

    public Car1(int speed, String color) {
        super(speed, color);
    }

    void carSpeed() {
        super.speed;
    }
}


public class Vehicle {
    int speed = 10;
    String color = "blue";

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }


    public static void main(String[] args) {
        Car1 ca1 = new Car1();
        ca1.carSpeed();
    }
}
*/
