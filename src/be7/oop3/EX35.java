package be7.oop3;

import be7.model.*;

public class EX35 {
    public static void main(String[] args) {
        // 다형성 : Object 이해
        // A객체를 upcasting으로 생성하시오.
        Object obj=new A();
        //System.out.println(obj.toString());
        ((A)obj).display();

        obj=new B();
        ((B)obj).display();

        printDisplay(new A());
        printDisplay(new B());
    }
    public static void printDisplay(Object  obj){ // 다형성 인수
       if(obj instanceof A){
           ((A)obj).display();
       }else{
           ((B)obj).display();
       }
    }
}
/*
 String(비교, split) 예제
 Dog, Cat, Animal
 abstract
 TV, Radio
 interface
 Object, Object[], toString, super.
 ArrayList
 API 활용
 JSON, XML
 IO,Network,Stream 등
 kakao open API book, Jsoup, 주소->위도, 경도
 크롤링
 */