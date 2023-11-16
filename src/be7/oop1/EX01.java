package be7.oop1;
//import java.lang.*; // 디폴트 package
public class EX01 {
    public static void main(String[] args) {
        // 변수(기억공간), 자료형, 할당(=)
        // Q 책 1개를 저장할 [변수를 선언]하세요.=>영어,언어(자바)
        int a; // 변수선언->기억공간만들어진다.
        a=12;
        // a가 짝수인지 홀수인지 판단하여 출력하시오.(? -> 논리적인 사고력?)
        if(a%2==0){
            System.out.println("짝수"); //0
        }else{
            System.out.println("홀수");
        }
        System.out.println(a); // 12

        int x=10;
        float f=(float)35.6; // 강제형변환(downcasting) : type casting(형변환) -> Object Casting(객체형변환)
        double d=35; // 자동 형변환(upcasting)
        char c=65;
        System.out.println(c); // 'A'
        int cc='a';
        System.out.println((char)cc);// 97->a
        boolean b=true; // 연산X, casting(X)
        // 클래스 전체이름(fullname) : java.lang.String
        String str="APPLE"; //  String(UDDT)
    }
}
