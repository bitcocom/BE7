package be7.oop1;

public class EX03 {
    public static void main(String[] args) {
        // 한개의 자료형 -> 여러개의 자료형 :배열, 반복문, 이동할때 장점
        int[] arr={10,20,30,40,50}; // 생성+초기화
        // 모든 원소의 합을 구하시오.
        int sum= arrTotal(arr); // 메서드 호출(Call)
        System.out.println(sum); // 150
    }
    // 배열의 모든 원소의 총합을 구하여 리턴하는 (Method)을 만들어야 한다.
    public static int arrTotal(int[] arr){
        int sum=0;
        for(int su : arr){
            sum+=su;
        }
        return sum;
    }
    //기본자료형, 사용자정의자료형(Book, Movie....)
}
