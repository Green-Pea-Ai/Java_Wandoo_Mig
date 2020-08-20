/*
// 200817 Sun
package Personal_Training;

// parent
class Machine {
    public String name;
    // m/s
    public int velocity;
    // meter
    public int flyingAltitude;

    public void machine_info() {
        System.out.println("========Parent Info========");
        System.out.println("Machine name: " + name +
                            "\nVelocity(m/s): " + velocity +
                            "\nFlying Altitude(m): " + flyingAltitude);
    }
}

// child
class Drone extends PT_Interface {

    String droneName;

    public void machine_info() {
        // 아래 라인을 주석 처리하면 child의 데이터만 출력한다.
        super.machine_info();
        System.out.println("========Child Info========");
        System.out.println("Drone name is: " + droneName);
    }

}

public class PT_Overriding {

    public static void main(String[] args) {
        Drone drone = new Drone();

        drone.name = "WD001";
        drone.velocity = 80;
        drone.flyingAltitude = 20;
        drone.droneName = "WD003";

        System.out.println("======start line========");

        // child의 machine_info() 메서드를 호출하지만
        // 상속을 받았기 때문에 부모의 데이터도 같이 출력된다.
        drone.machine_info();
    }
}
*/
