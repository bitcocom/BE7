package be7.jdbc;

import be7.model.BookDAO;
import be7.model.BookDTO;
public class JDBC02 {
    public static void main(String[] args) {
        int num=1;
        int price=54000;
        int page=390;
        // DTO -> DAO
        BookDTO dto=new BookDTO();
        dto.setNum(num);
        dto.setPrice(price);
        dto.setPage(page);

        BookDAO dao=new BookDAO(); // 처리로직을 가지고 있는 객체 : DAO
        int cnt=dao.bookUpdate(dto);

        if(cnt>0){
            System.out.println("수정성공");
        }else{
            System.out.println("수정실패");
        }
    }
}
