package be7.oop2;

import be7.model.BookDTO;

public class EX19 {
    public static void main(String[] args) {
       //BookDTO()
       // 1.객체를 생성하는 역할(Heap Area)
       // 2.객체의 초기화
       BookDTO b=new BookDTO("자바", 30000, "김길동", 500); // 자바, 30000, 김길동, 500
       // 객체가 가지고 있는 모든 값을 출력하는 부분
       //System.out.println(b.getTitle()+"\t"+b.getPrice()+"\t"+b.getName()+"\t"+b.getPage());
       // toString() :  디버깅 용도
       //System.out.println(b.toString());
       System.out.println(b); // b.toString()
       // 초기화는 개발자가 하고 싶은데로 할수있어야 한다.
       // 오라클, 40000, 나길동, 700
       BookDTO b1=new BookDTO("오라클",40000,"나길동",700);
        System.out.println(b1);
    }
}
