package be7.jdbc;
// JDBC
// Programming
import java.sql.*; // 4개
public class JDBC01 {
    public static void main(String[] args) {
        // 1.Driver 다운로드
        // 2.설치(연결)
        // 3.접속(연결)정보
        // http://
        // ftp://
        String url="jdbc:mysql://localhost:3306/books"; // ip,port,db이름
        String username="root";
        String password="12345";

        //String SQL="insert into booktbl(title, price, name, page) values(?,?,?,?)";
        // 4. 객체생성
        // DriverManager dm=new com.mysql.cj.jdbc.Driver(); // 정적로딩방법->DB변경이되면?
        try {
            // 1. 드라이버로딩
            Class.forName("com.mysql.cj.jdbc.Driver");// 동적로딩 -> 리플렉션
            // 2. 연결객체(Connection)
            Connection conn=DriverManager.getConnection(url, username, password);
            System.out.println("연결성공");
            // 3. SQL 문장작성
            String title="자바스크립트";
            int price=26000;
            String name="박길동";
            int page=610;
            //String SQL="insert into booktbl(title, price, name, page) values('자바스크립트',26000,'박길동',610)";
            //String SQL="insert into booktbl(title, price, name, page) values('"+title+"',"+price+",'"+name+"',"+page+")";
            //                                                 ?:파라메터    1 2 3 4.....
            String SQL="insert into booktbl(title, price, name, page) values(?,?,?,?)";
            // 4. SQL문장을 전송객체(Statement < PreparedStatement)
            PreparedStatement ps=conn.prepareStatement(SQL); // 실행속도가 빠르다, SQL유지보수가 쉽다
            ps.setString(1, title);
            ps.setInt(2, price);
            ps.setString(3,name);
            ps.setInt(4, page);
            int cnt=ps.executeUpdate(); // 실행(다시컴파일 하지 않고 바로 실행됨)
            if(cnt>0){
                System.out.println("저장성공");
            }else{
                System.out.println("저장실패");
            }
        }catch(Exception e){ // 예외다형성
            e.printStackTrace();
        }
    }
}
