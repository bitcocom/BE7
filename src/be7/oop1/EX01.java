package be7.oop1;

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
    }
}
