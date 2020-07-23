package Seventh_0723;

// 웹에서 찾은 글에서 가져옴
interface TestInterface{
    public static int num = 8;
    public void fun1();
    public void fun2();
}

// 부모의 것을 가져와서 부모의 매소드를 재정의?(오버라이드)해서 써야함
class InterfaceA implements TestInterface{
    @Override
    public void fun1(){
        System.out.println(num);
    }

    @Override
    public void fun2() {

    }
}

public class InterfaceExam{
    public static void main(String args[]){
        InterfaceA exam = new InterfaceA();
        exam.fun1();
    }
}
