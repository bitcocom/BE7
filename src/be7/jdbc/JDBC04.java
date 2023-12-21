package be7.jdbc;

import be7.model.BookDAO;
import be7.model.BookDTO;

import java.util.List;

public class JDBC04 {
    public static void main(String[] args) {
        BookDAO dao=new BookDAO();
        List<BookDTO> list=dao.bookList();
        // 정렬 알고리즘?
        for(BookDTO book : list){
            System.out.println(book.toString());
        }
    }
}
