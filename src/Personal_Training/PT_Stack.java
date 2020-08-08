package Personal_Training;

import java.util.Stack;

public class PT_Stack {

    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push("3");
        stk.push("7");
        stk.push("1");
        stk.push("0");
        stk.push("8");

        // 3 -> 7 -> 1 -> 0 -> 8 순서로 데이터 삽입됨
        // 8부터 차례대로 빠져나온다.
        System.out.println("---Stack---");
        while (!stk.empty()) {
            System.out.println(stk.pop());
        }
    }
}
