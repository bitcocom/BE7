package be7.api;

import be7.model.BookDTO;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.print.Book;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX42 {
    public static void main(String[] args) {
        List<BookDTO> bList=new ArrayList<>();
        Scanner scan=new Scanner(System.in); //  InputStream(read 빨대)
        while(true){
            System.out.print("책제목(exit):");
            String title=scan.nextLine();
            if(title.equals("exit")) break;
            System.out.print("책가격:");
            int price=scan.nextInt();
            scan.nextLine();
            System.out.print("책저자:");
            String name=scan.nextLine();
            System.out.print("책페이수:");
            int page=scan.nextInt();
            scan.nextLine();
            // DTO, List
            BookDTO dto=new BookDTO(title,price,name,page);
            bList.add(dto);
        }//
        System.out.println(bList.toString()); //
        scan.close();
        JSONArray books=new JSONArray(); // [ {      },{      } ]
        for(BookDTO dto : bList){
            JSONObject book=new JSONObject();// {      }
            book.put("title",dto.getTitle());
            book.put("price",dto.getPrice());
            book.put("name",dto.getName());
            book.put("page",dto.getPage());
            books.put(book);
        }
        JSONObject root=new JSONObject();
        root.put("books", books);
        System.out.println(root.toString());
        // 파일에 저장할수있는 출력 스트림(빨대)
        // try ~ catch ~ : 예외처리블럭
        try {
            FileWriter fw = new FileWriter("books.json");
            fw.write(root.toString());
            fw.close();
            System.out.println("파일 생성 완료");
        }catch(Exception e){ // 예외다형성
            e.printStackTrace();
        }
    }
}
