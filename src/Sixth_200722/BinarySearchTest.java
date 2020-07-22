package Sixth_200722;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// 법칙중 하나
// 1 + 2 + 4 + 8 + 16 = 32 - 1
// 1 + 2 + 4 + 8      = 16 - 1
// 1 + 2 + 4          = 8  - 1
// 1 + 2              = 4  - 1
// 1                  = 2  - 1

// 42억개의 데이터를 검색한다고 가정
// 어떤 방식이 가장 빠를까?

// 트리 - 일반 트리, AVL 트리, RB 트리, B 트리, A-Star
//                 50            2^0
//            25         75      2^1
//        10    30    60    80   2^2
//       5 12 27 31 55 63 77 88  2^3
//    .......................    ...
//                               2^n

// 2^32가 약 42억 정도
// 32번 정도만 검색해도 일이 끝난다.
public class BinarySearchTest {
    // 대체로 준비를 잘해오다보니 이 자료구조를 묻는 회사는 적다고 함
    // 왜 사용하는지 효율적인 사용방법이 뭔지는 숙지하고 있어야 함

    // 일반트리 - 어려움(이 정도까지만 알고 있어도 됨?)
    // 넥슨 - 고등 물리올림피아드 문제낸적 있음(물리엔진 만드니까)
    // 지금은 돈딸려서 빡세게는 못낸다고 함
    // RB트리(구글 본사에서 나옴)
    public static void main(String[] args) {
        int key = 50;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            list.add(i);
        }

        int idx = Collections.binarySearch(list, key);
        System.out.println("탐색값: " + idx);
    }
}
