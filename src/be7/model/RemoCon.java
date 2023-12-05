package be7.model;
// 부모(RemoCon) : 불완전한 부모
public interface RemoCon { // 리모콘(동작 정의만 한다 , 구현을 하면 X)
    public abstract void add(int data); // 추상메서드
    public int get(int index); // 추상메서드
    public int size(); // 추상메서드
}
