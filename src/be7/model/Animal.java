package be7.model;

public abstract class Animal { // 추상클래스
    public abstract void eat(); // 추상메서드(설계용)
    public void move(){// 구현메서드
        System.out.println("무리를 지어서 이동한다.");
    }
}
