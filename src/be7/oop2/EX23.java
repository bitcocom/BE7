package be7.oop2;

import be7.model.BookDTO;

import java.util.Scanner;

public class EX23 {
    public static void main(String[] args) {
        // 키보드로 부터 책 정보을 입력 받아서 출력하시오.
        Scanner scan=new Scanner(System.in);
        System.out.print("책 제목:");
        String title=scan.nextLine();

        System.out.print("책 가격:");
        int price=scan.nextInt();
        scan.nextLine(); // 엔터를 한번 읽어 주기
        System.out.print("책 저자:");
        String name=scan.nextLine();

        System.out.print("책 페이지수:");
        int page=scan.nextInt();
        // 책정보를 하나로 묶어주기(DTO)
        BookDTO dto=new BookDTO(title, price, name, page);
        System.out.println(dto);
    }
}
// String 문자열 처리 공부 -> 상속