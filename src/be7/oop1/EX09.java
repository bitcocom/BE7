package be7.oop1;

public class EX09 {
    public static void main(String[] args) {
        // 변수 -> 배열
        // 변수 -> 메서드?
        int a=300;
        int b=500;
        //a+b=800 : 메서드 호출(Call)
        int sum=intHap(a,b);
        System.out.println(sum); //800
    }
    // [매개변수로 2개의 정수를 받아서] [총합을 구하여] [리턴하는] 메서드를 정의(intHap)
    public static int intHap(int a, int b){ // 메서드이름이 => 변수역할을 한다.
       int sum=a+b; // 총합
       return sum;
    }
}
