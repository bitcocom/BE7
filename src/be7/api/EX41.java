package be7.api;

import org.json.JSONArray;
import org.json.JSONObject;

public class EX41 {
    public static void main(String[] args) {
        // API
        // JSON Data Format -> org.json API : https://mvnrepository.com/
        JSONObject obj1=new JSONObject(); // { "name":"나길동",,,,,,    }
        obj1.put("name", "나길동");
        obj1.put("age", 30);

        JSONObject obj2=new JSONObject(); // { "name":"나길동",,,,,,    }
        obj2.put("name", "조길동");
        obj2.put("age", 35);

        JSONArray array=new JSONArray(); // [ {    },{    } ]
        array.put(obj1); // {    }
        array.put(obj2); // {    }

        JSONObject root=new JSONObject();
        root.put("members", array);
        System.out.println(root.toString()); // https://jsoneditoronline.org/
        // json 데이터를 파싱하는 방법
        String json=root.toString(); //{"members":[{"name":"나길동","age":30},{"name":"조길동","age":35}]}
        JSONObject jsonObject=new JSONObject(json);
        JSONArray jsonArray=jsonObject.getJSONArray("members");
        for(int i=0;i<jsonArray.length();i++){
            JSONObject memberJson=jsonArray.getJSONObject(i);
            String name=memberJson.getString("name");
            int age=memberJson.getInt("age");
            // DTO,VO : 묶고-> List : 담고
            System.out.println(name+"\t"+age);
        }
        // books.json : 파일 데이터베이스
    }
}
/*
  A(Java) -> 회원(Object, DataType) : Member | 문자열

  B(C#)   -> 회원 : -------------------------| 문자열

  C(Python)->회원 : -------------------------| 문자열

  회원(text data)
  1. TEXT : "이길동 30 010-1111-1111 서울 bit@empas.com#나길동 30 010-1111-1111 서울 bit@empas.com"
      -----> 데이터 조작이 어렵다(프로토콜:공백,이름,나이,전화,주소.이메일)
  2. XML Data Format : 데이터 크기 증가, API/의미(자세하게 표현)
    <members>
     <member>
       <name>이길동</name>
       <age>30</age>
       <tel part="hp">010-1111-1111</tel>
       <address>서울</address>
       <email>bit@empas.com</email>
     </member>
     <member>
       <name>나길동</name>
       <age>30</age>
       <tel part="hp">010-1111-1111</tel>
       <address>서울</address>
       <email>bit@empas.com</email>
     </member>
     </members>

     3. JSON Data Format : json.org -> JSON (JavaScript Object Notation) is a lightweight data-interchange format
     [
      {"name":"나길동","age":30,"tel":"010-1111-1111","email":"bit@empas.com"},
      {"name":"나길동","age":30,"tel":"010-1111-1111","email":"bit@empas.com"}
     ]
 */