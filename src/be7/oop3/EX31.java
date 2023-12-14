package be7.oop3;

import be7.model.Cat;
import be7.model.Dog;

import java.util.Calendar;

public class EX31 {
    public static void main(String[] args) {
       // Dog(개), Cat(고양), ----> Animal(동물)
        Dog g=new Dog();
        g.eat(); //Animal
        g.move();
        Cat c=new Cat();
        c.eat(); //Animal
        c.night();
        c.move();
    }
}
/*
 String(비교, split) 예제
 Dog, Cat, Animal
 abstract
 TV, Radio
 interface
 Object, Object[]
 ArrayList
 API 활용
 JSON, XML
 IO,Network, Stream 등
 크롤링
 */