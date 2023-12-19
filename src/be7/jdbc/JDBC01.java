package be7.jdbc;
// JDBC
// Programming
import java.sql.*; // 4개
public class JDBC01 {
    public static void main(String[] args) {
        // 1.Driver 다운로드
        // 2.설치(연결)
        // 3.접속정보
        String url="jdbc:mysql://localhost:3306/books"; // ip,port,db이름
        String username="root";
        String password="12345";
        // 4. 객체생성
        // DriverManager dm=new com.mysql.cj.jdbc.Driver(); // 정적로딩방법->DB변경이되면?
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// 동적로딩
            // 연결
            Connection conn=DriverManager.getConnection(url, username, password);
            if(conn!=null){
                System.out.println("연결성공"); // O
            }else{
                System.out.println("연결실패");
            }
            // CRUD SQL
        }catch(Exception e){ // 예외다형성
            e.printStackTrace();
        }
    }
}
