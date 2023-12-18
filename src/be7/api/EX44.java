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
