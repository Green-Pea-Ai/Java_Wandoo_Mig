package Sixth_200722;

public class FinallyTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            arr[11] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위를 벗어났다.");
        } finally {
            arr = null;
        }
        System.out.println("나온다");
    }
}
