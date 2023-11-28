package be7.oop2;

import be7.model.*;
public class EX18 {
    public static void main(String[] args) {
        // [정수] 1개를 저장할 [변수를 선언]하시오.
        int a;
        a=10;
        // [책] 한권을 저장할 [변수를 선언]하시오.
        // 책을 저장하기 위한 [객체를 생성=인스턴스(실체)]하는 방법
        BookDTO b=new BookDTO(); // new(객체생성) , BookDTO() : 디폴트생성자메서드
        b.setTitle("자바");
        b.setPrice(30000);
        b.setName("김길동");
        b.setPage(600);
        EX18.bookPrint(b);// 번지전달기법(Call By Reference)
    }
    // 매개변수로 책 1권을 받아서 출력하시오(bookPrint).
    public static void bookPrint(BookDTO b){
        System.out.println(b.getTitle()+"\t"+b.getPrice()+"\t"+b.getName()+"\t"+b.getPage());
    }

}
