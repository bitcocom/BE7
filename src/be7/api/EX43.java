package be7.api;

import be7.model.BookDTO;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileReader;

public class EX43 {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("books.json");
            StringBuilder jsonString=new StringBuilder();
            int data;
            while ((data=fr.read())!=-1){
                jsonString.append((char)data);
            }
            System.out.println(jsonString.toString());
            fr.close();
            // FileInputStream : 1byte단위로 read
            JSONObject jsonBooks=new JSONObject(jsonString.toString());
            JSONArray books =jsonBooks.getJSONArray("books");
            for(int i=0;i<books.length();i++){
                JSONObject book=books.getJSONObject(i);
                String title=book.getString("title");
                int price=book.getInt("price");
                String name=book.getString("name");
                int page=book.getInt("page");
                BookDTO dto=new BookDTO(title, price, name, page);
                System.out.println(dto);
            }
        }catch(Exception e){
            e.printStackTrace();// 오류 메세지~~디버깅
        }
    }
}
