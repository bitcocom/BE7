package be7.model;

// 부모 (RemoCon) : 불완전한 부모
public interface RemoCon { // 리모콘 (동작을 정의만 한다. 구현을 하면 안 된다.)
    public abstract void add(int data); // 정의만 -> 추상 메서드
    public int get(int index); // 추상 메서드
    public int size(); // 추상 메서드
}
/*
  1. 일반클래스 2. 추상클래스(추상메서드+구현메서드) 3. 인터페이스(추상메서드)
     RemoCon rm=new RemoCon();

 */