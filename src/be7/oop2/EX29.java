package be7.oop2;
//import java.lang.*;
public class EX29 {
    public static void main(String[] args) {
        // 문자열 처리
        // "APPLE"(객체, String)
        // ㄱ ㅊ ㅅ ㅅ                  012345....
        String str=new String("APPLE"); // Heap Area
        System.out.println(str.length());
        System.out.println(str.charAt(3)); // L
        //String str1="APPLE"; // Literal POOL(문자열 상수)
        //int a=10;
        for(int i=0;i<str.length();i++){
            System.out.print((char)(str.charAt(i)+32)); //A(65) -> a(97) : 32
        }
        System.out.println();
        System.out.println(str.toLowerCase()); // apple
        System.out.println(str.toUpperCase()); // APPLE
        //  012345
        // "APPLE" -> "PL"
        System.out.println(str.substring(2,4)); // "PL"
        // "APPLE" -> "L"의 index(위치) : 3
        System.out.println(str.indexOf("X")); // 3 or -1
        // "APPLE" -> P-># 수정
        System.out.println(str.replaceAll("P","#"));
        // 분자열 분리(split, 구분자)
        String s="apple#red#blue";
        String[]sp=s.split("#");
        for(int i=0;i<sp.length;i++){
            System.out.println(sp[i]); // sp[i].toString()
        }
        // 문자열 비교?
    }
}
