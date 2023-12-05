package be7.oop2;

import be7.model.IntArray;
import be7.model.RemoCon;

public class EX27 {
    public static void main(String[] args) {
        // IntArray.class(O), RemoCon.class(O), RemoCon.java(O), IntArray.java(X)
        // 정수 5개를 배열에 저장하고 총합을 구하여 출력하시오. 정렬...
        // 객체생성
        // 부모 = 자식
        RemoCon arr = new IntArray(); // 자동형변환 (Upcasting)
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
    }
}
