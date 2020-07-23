package Fifth_200721;

class Vehicle {
    private int speed = 10;
    private String color = "green";

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
}

class Airplane extends Vehicle {

    String cp_name;

    public Airplane(int speed, String color, String cp_name) {
        super(speed, color);
        this.cp_name = cp_name;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "speed = " + getSpeed() +
                ", 색상 = " + getColor() +
                ", cp_name = " + cp_name +
                '}';
    }
}

class Car1 extends Vehicle{

    boolean turbo;

    public Car1(int speed, String color, boolean turbo) {
        super(speed, color);
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "speed = " + getSpeed() +
                ", 색상 = " + getColor() +
                ", turbo = " + turbo +
                '}';
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Airplane ap = new Airplane(150, "sky", "대한항공");
        System.out.println(ap);

        Car1 c1 = new Car1(220, "red", true);
        System.out.println(c1);
    }
}
