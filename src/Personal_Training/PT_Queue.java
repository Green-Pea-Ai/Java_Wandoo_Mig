package Personal_Training;

import java.util.LinkedList;
import java.util.Queue;

public class PT_Queue {
    public static void main(String[] args) {
        Queue que = new LinkedList();

        que.add("7");
        que.add("5");
        que.add("2");
        que.add("4");
        que.add("1");

        // 7 -> 5 -> 2 -> 4 -> 1 순서로 데이터 삽입됨
        // 7부터 차례대로 빠져나간다.
        System.out.println("--- Queue ---");
        while(!que.isEmpty()) {
            System.out.println(que.poll());
        }
    }
}
