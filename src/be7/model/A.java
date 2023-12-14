package be7.model;
//import java.lang.*;
public class A extends Object{  //Object -> toString() : 객체의 번지를 문자열로 출력
    public A(){
        super(); // new Object()
    }
    public void display(){
        System.out.println("나는 A이다.");
    }
    @Override
    public String toString(){
        // 부모의 toString() 사용하고 싶다.
        System.out.println(super.toString());// 번지?
        return "A이 toString()";
    }
}
