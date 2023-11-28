package be7.oop1;

public class EX09 {
    public static void main(String[] args) {
        int a=300;
        int b=500;
        int sum=EX09.intHap(a,b);
        System.out.println(sum);
    }
    public static int intHap(int a, int b){
       int sum=a+b; // 총합
       return sum;
    }
}
/*
-메서드 파라메터 전달방식, 메서드 오버로딩, static 개념, JVM 동작방식(메서드 관점)
-사용자정의자료형, class(클래스), Book(책), Movie(영화) 객체 만들어 보기
 */