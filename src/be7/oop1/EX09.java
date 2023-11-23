package be7.oop1;

public class EX09 {
    public static void main(String[] args) {
        // 변수 -> 배열
        // 변수 -> 메서드?
        int a=300;
        int b=500;
        //a+b=800 : 메서드 호출(Call)
        intHap(a,b);
        //System.out.println(sum); //800
    }
    // [매개변수로 2개의 정수를 받아서] [총합을 구하여] [리턴하는] 메서드를 정의(intHap)
    public static void intHap(int a, int b){ // 메서드이름이 => 변수역할을 한다.
       int sum=a+b; // 총합
       //return sum;
        System.out.println(sum); // 800
    }
}
/*
-메서드 파라메터 전달방식, 메서드 오버로딩, static 개념, JVM 동작방식(메서드 관점)
-사용자정의자료형, class(클래스), Book(책), Movie(영화) 객체 만들어 보기
 */