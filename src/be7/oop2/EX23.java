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
        int price=scan.nextInt(); // 숫자를 읽고 엔터가 버퍼에 남아 있음
        scan.nextLine();          // 그래서 엔터를 한번 읽어 주어야 한다.
        System.out.print("책 저자:");
        String name=scan.nextLine(); // 위에서 엔터를 읽어 주지 않으면 여기서 엔터가 버퍼에 남아 있어서 읽어 버리기 때문에 다음 줄로 넘어 가게 됨

        System.out.print("책 페이지수:");
        int page=scan.nextInt();
        // 책정보를 하나로 묶어주기(DTO)
        BookDTO dto=new BookDTO(title, price, name, page);
        System.out.println(dto);
    }
}
// String 문자열 처리 공부 -> 상속