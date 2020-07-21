package Second;

class Stundent {
    // 당장 해석할 때 private, public을 없다 생각하고 해석하자!
    private String name;
    private int age;
    private String major;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getMajor() {
        return major;
    }
}

class Vehicle {
    String v_name;
    String v_color;
    int v_speed;
}

class Cust_Adding {

    int sum = 0;
    int a;
    int b;

    public Cust_Adding() {
        a = 1;
        b = 20;
    }

    public Cust_Adding(int num1, int num2) {

        a = num1;
        b = num2;
    }

    public void adding() {
        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                sum += i;
                //System.out.println(sum);
            }
            //System.out.println(sum);
        }

    }
}

public class 숙제 {

    int a, b;

    숙제(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void adding() {

        int sum = 0;

        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                sum += i;
                //System.out.println(sum);
            }
            //System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println("숙제이다");

        /*Second.숙제 a = new Second.숙제();
        a.adding();*/


        /*Second.Cust_Adding ca2 = new Second.Cust_Adding(1, 20);
        ca2.adding();*/

        /*int sum=0;

        for(int i=1; i<=20; i++) {
            if(i % 2 == 0) {
                sum += i;
                //System.out.println(sum);
            }
            //System.out.println(sum);

        }
        System.out.println(sum);*/
    }

}

//git 테스트
//dfsdf