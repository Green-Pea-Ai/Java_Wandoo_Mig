// 200823 Sun
package Personal_Training;

public class PT_SortAlgorithm {

    public static void main(String[] args) {

        // 선택정렬 결과 출력부
        // 1단계: a[0]인 9를 가리킨다, 배열값 중에서 최소값인 1과 자리를 바꾼다.
        // 2단계: a[1]인 6을 가리킨다, 남은 배열값 중에서 최소값인 3과 자리를 바꾼다.
        // 2단계에 오름차순 정렬 완료됨
        System.out.println("===========[선택정렬]===========");
        int a[] = {9, 6, 3, 8, 1};
        PT_Sort pt_sort = new PT_Sort();

        System.out.printf("\n정렬할 원소:");
        for(int v : a) {
            System.out.printf("%3d", v);
        }
        System.out.println();
        pt_sort.wd_SelectionSort(a);


        // 버블정렬 결과 출력부
        // a[0]이 key값, a[0]과 a[1]을 비교 a[0]이 크면 a[1]과 자리를 바꾼다.
        // key값이 작으면 위치를 유지하고, key값이 크면 자리를 바꾼다.
        // 1단계: 9가 a[1]~a[4] 배열에 한번씩 들어간다. a[4]에 안착
        // 2단계: 다음 주자 8, a[2]~[a4] 배열에 한번씩 들어간다. a[3]에 안착
        // 3단계: 다음 주자 1, 1 < 3 = true(제자리), 3 < 2 = false(자리교체)
        // 4단계: 1 < 2 = true, 2 < 3 = true, 3 < 8 = true, 8 < 9 = true(정렬 완료)
        System.out.println();
        System.out.println("===========[버블정렬]===========");
        int b[] = {9, 8, 1, 3, 2};
        System.out.printf("\n정렬할 원소");
        for(int v : b) {
            System.out.printf("%3d", v);
        }
        System.out.println();
        pt_sort.wd_BubbleSort(b);


        // 삽입정렬 결과 출력부
        // key값보다 큰 값은
        // i 이전의
        System.out.println();
        System.out.println("===========[삽입정렬]===========");
        int c[] = {9, 8, 1, 3, 2};
        System.out.printf("\n정렬할 원소 :");
        for(int v : c) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        pt_sort.wd_InsertionSort(c);
    }

}


class PT_Sort {
    // 선택 정렬
    public void wd_SelectionSort(int a[]) {

        // 0 < 4, 0부터 3까지 총 4번 반복한다.
        // a.length는 5이다. int a[] = {9, 6, 3, 8, 1};
        for(int i = 0; i < a.length - 1; i++) {

            int min = i;

            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }

            }
            wd_Swap(a, min, i);
            System.out.printf("\n선택 정렬 %d 단계: ", i + 1);
            // 향상된 for문
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
        }
        System.out.println();
    }

    // 버블 정렬
    public void wd_BubbleSort(int a[]) {
        int size = a.length;
        for(int i = size - 1; i > 0; i--) {
            System.out.printf("\n버블 정렬 %d 단계: ", size - i);
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j + 1]) {
                    // i와 j를 헷갈리지 말자
                    wd_Swap(a, j, j + 1);
                }
                System.out.printf("\n\t");
                for(int v : a) {
                    System.out.printf("%3d", v);
                }
            }
        }
        System.out.println();
    }


    // 삽입 정렬
    // 200829 Sat PT때 진행( 8 > 1 > 3 > 2로 key값을 가지는 과정을 코드에서 어떻게 처리했는지 이해하기)
    // 1단계: key값 8(비교할 값이 있어야 하기에 a[1]부터 시작
    // key값 8을 기준으로 왼쪽 값과 비교, 8보다 큰 값은 오른쪽으로 밀어버림
    // 8보다 작은 원소가 있다면 그 원소 뒤에 8을 삽입. 없으니 맨 앞에 삽입됨
    // 2단계: key값 1, 8과 9를 우측으로 밀어버림. 더 작은 원소가 없어 맨 앞에 위치
    // 3단계: key값 3, {8, 9} 밀어버림, 원소값 1 뒤에 안착.
    // 4단계: key값 2, {3, 8, 9} 밀어버림, 원소값 1 뒤에 안착.(정렬 완료)
    public void wd_InsertionSort(int a[]) {
        // 일부 코드 참고자료 1에 있는 것으로 변경함.
        int size = a.length;
        for(int i = 1; i < size; i++) {
            int temp = a[i];
            int j = i - 1;
            while((j >= 0) && (a[j] > temp)) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
            System.out.printf("\n삽입정렬 %d 단계: ", i);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
        }
        System.out.println();
    }

    // a를 wd_SelectionSort() 안에 넣으면 변수 a를 공유해서
    // 오류가 발생한다.(변수 중복 사용)
    public void wd_Swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}