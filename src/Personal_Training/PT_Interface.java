// 200820 Thur
package Personal_Training;

interface Animal {
    public abstract void cry();
}

class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("냐옹~");
    }
}

class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("멍멍!");
    }
}

public class PT_Interface {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
