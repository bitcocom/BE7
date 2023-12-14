package be7.oop3;

import be7.model.A;
import be7.model.B;
import be7.model.BookDTO;

public class EX36 {
    public static void main(String[] args) {
        // Object -> toString()
        BookDTO dto=new BookDTO("자바", 30000, "홍길동", 500);
        System.out.println(dto);

        String str="APPLE";
        System.out.println(str.toString());

        // A, B 클래스를 저장할 배열을 생성?
        // A[], B[] => Object[]
        Object[] obj={new A(), new B()}; // 2. 다형성 배열
        objectArry(obj); // Call by reference
    }
    public static void objectArry(Object[] obj){
      for(int i=0;i<obj.length;i++){
          if(obj[i] instanceof  A) {
              ((A) obj[i]).display();
          }else {
              ((B) obj[i]).display();
          }
      }
    }
}
