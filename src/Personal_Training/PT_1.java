package Personal_Training;

// #1. 1 ~ 100까지의 정수에서 짝수를 모두 뽑아내시오.
public class PT_1 {
    // 오류 : Unexpected token
    // 원인 : psvm 안쓰고 for문만 써놓고 왜 안되나 뇌절함
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }

}
