// 200820 Thur
package Personal_Training;

interface Animal_ {
    public abstract void cry();
}


interface Cat_ extends Animal_ {
    public abstract void cry();
}

interface Dog_ extends Animal_ {
    public abstract void cry();
}

class MyPet_ implements Cat_, Dog_ {
    @Override
    public void cry() {
        System.out.println("멍멍! 냐아옹!");
    }
}

public class PT_Animal {
    public static void main(String[] args) {
        MyPet_ myPet_ = new MyPet_();
        myPet_.cry();
    }
}
