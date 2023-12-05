package be7.oop2;

import be7.model.IntArray;

public class EX26 {
    public static void main(String[] args) {
        // TV.java(X), TV.class(O) <---> RemoCon(O) <---> 사람
        // IntArray.java(X), IntArray.class(O) <---> ?
        // 사용 설명서 : Object[]
        IntArray arr = new IntArray(5); // 기본 크기 10 size
        arr.add(10); // 0
        arr.add(20); // 1
        arr.add(30); // 2 -> cnt(3)

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
