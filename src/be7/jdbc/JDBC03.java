package be7.jdbc;

import be7.model.BookDAO;

public class JDBC03 {
    public static void main(String[] args) {
        int num=1;
        BookDAO dao=new BookDAO();
        int cnt=dao.bookDelete(num);
        if(cnt>0){
            System.out.println("삭제성공");
        }else{
            System.out.println("삭제실패");
        }
    }
}
