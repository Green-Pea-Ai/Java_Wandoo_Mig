// 200820 Thur
package Personal_Training;

interface Animal {
    public abstract void cry();
}

interface Talent {
    public abstract void character();
}

class Cat implements Animal, Talent {

    @Override
    public void cry() {
        System.out.println("냐옹~");
    }

    @Override
    public void character() {
        System.out.println("고양이는 호기심이 많다.");
    }
}

class Dog implements Animal, Talent {
    @Override
    public void cry() {
        System.out.println("멍멍!");
    }

    @Override
    public void character() {
        System.out.println("강아지는 사람을 잘 따른다.");
    }
}

public class PT_Interface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.cry();
        cat.character();

        System.out.println();

        dog.cry();
        dog.character();

    }
}
