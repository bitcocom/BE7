package be7.model;

// 부모 (RemoCon) : 불완전한 부모
public interface RemoCon { // 리모콘 (동작을 정의만 한다. 구현을 하면 안 된다.)
    public abstract void add(int data); // 정의만 -> 추상 메서드
    public int get(int index); // 추상 메서드
    public int size(); // 추상 메서드
}
