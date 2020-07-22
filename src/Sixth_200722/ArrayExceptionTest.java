package Sixth_200722;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            arr[11] = 100;
        // 배열의 할당된 크기 이상의 작업을 수행하려고 할 때 발생한다.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위를 벗어났다.");
        }

        System.out.println("왓 더");
    }
}
