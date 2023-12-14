package be7.model;

public class Cat extends Animal{ // 단일상속(다중상속, C++,C#)
    // 먹다
    public void night(){
        System.out.println("밤에 눈에 빛이난다.");
    }
    @Override // 재정의(@어노테이션)
    public void eat() {
        System.out.println("고양이 처럼 먹다");
    }
}
