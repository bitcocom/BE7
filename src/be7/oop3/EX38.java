package be7.oop3;

import be7.model.B;
import be7.model.BookDTO;
import be7.model.ObjectArray;

import java.util.ArrayList;

public class EX38 {
    public static void main(String[] args) {
        // 10이라는 정수를 만들어보자
        int a=10;
        Integer aa=new Integer(10); // Wrapper
        System.out.println(aa.intValue()); // aa.toString() -> "10"
        // Integer=int (X)
        Integer bb=10;// boxing(박싱) -> new Integer(10)
        int cc=new Integer(30);// unboxing(언박싱)
        System.out.println(cc);

        ObjectArray<Integer> arr=new ObjectArray<>();
        arr.add(10); //boxing
        arr.add(20);
        arr.add(30);
        for(int i=0;i<arr.size();i++) {
            //int data = arr.get(0); // unboxing(언박싱)
            System.out.println(arr.get(i));
        }
        // Object[]->BookDTO[]
        // List API - ArrayList -> Object[]
        ArrayList<BookDTO> brr=new ArrayList<>(1);
        brr.add(new BookDTO("자바", 30000, "홍길동", 500));
        brr.add(new BookDTO("자바", 30000, "홍길동", 500));
        brr.add(new BookDTO("자바", 30000, "홍길동", 500));
        for(int i=0;i<brr.size();i++) {
            //int data = arr.get(0); // unboxing(언박싱)
            System.out.println(brr.get(i));
        }
    }
}
