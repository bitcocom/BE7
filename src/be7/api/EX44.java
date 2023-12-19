package be7.api;
import be7.model.BookDTO;
import com.google.gson.Gson;

public class EX44 {
    public static void main(String[] args) {
        // Gson ->
        // Object -> JSON
        BookDTO dto=new BookDTO("자바",30000,"이길동", 500);
        Gson gson=new Gson();
        String json=gson.toJson(dto);
        System.out.println(json); // {"title":"자바","price":30000,"name":"이길동","page":500}
        // JSON -> Object
        BookDTO dto1=gson.fromJson(json, BookDTO.class);
        System.out.println(dto1); // ?
    }
}
/*
   책이라는 데이터를 어디에 저장을 할까?
   1. 메모장
   2. Excel
   3. 데이터베이스관리시스템(DBMS--SQL--->CRUD) - MySQL, Oracle, MS-SQL
      DBMS 테이터를 저장할려면 -> Table(테이블, Entity,,,) : 관계형데이터베이스(RDBMS)
      사람 ----관리(CRUD)---------------->  DBMS
              SQL(표준 구조화 질의어)      - table,,,,
      MySQL 설치
      |--Database Server 설치(프로그램) - 3306port
      |--Workbench 8.0 - 접속TOOL
 */