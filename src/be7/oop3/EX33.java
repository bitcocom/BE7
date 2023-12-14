package be7.oop3;

import be7.model.Animal;
import be7.model.Cat;
import be7.model.Dog;

public class EX33 {
    public static void main(String[] args) {
        // 다형성 활용 : 다형성 인수
        display(new Dog());
        display(new Cat());
    }
    public static void display(Animal ani){ // 다형성 인수
        ani.eat();
        ani.move();
        //ani.night();
        if(ani instanceof Cat) {
            ((Cat) ani).night();  // 어떤 타입으로 다운케스팅 할것인가를 정확하게 파악
        }
    }

}
