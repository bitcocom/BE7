package be7.oop3;

import be7.model.Animal;
import be7.model.Cat;
import be7.model.Dog;

public class EX32 {
    public static void main(String[] args) {
        //Animal ani=new Animal(); // 객체생성 불가
        // 다형성 이론 전제조건 =>보장
        // 1. 상속관계(추상클래스(50%), 인터페이스(100%))
        // 2. 재정의가 반드시 선행되어야 한다.
        // 3. 객체를 생성할때 upcasting(부모를 사용)
        // 4. 동적바인딩
        Animal ani=new Dog(); // upcasting
        ani.eat();
        ani.move();

        ani=new Cat();
        ani.eat();
        ani.move();
        //ani.night(); // X
        //Cat c=(Cat)ani; // downcasting(다운케스팅)
        ((Cat)ani).night(); // 이해?

    }
}
