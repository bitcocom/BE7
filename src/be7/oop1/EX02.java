package be7.oop1;
//import java.lang.*;
public class EX02 {
    static int b; // 멤버변수(0)
    public static void main(String[] args) {
        // 하나의 데이터를 처리하는 방법과 여러 개의 데이터를 처리하는 방법
        int a = 10; // 선언+초기화 <-- 지역변수(초기화)
        System.out.println(a+10);
        System.out.println(b);// 0
        // [정수 데이터 5개를 저장]하고 그 [합을 계산]해서 출력한다면 어떻게 될까요.
        int a1=10;
        int a2=20;
        int a3=30;
        int a4=40;
        int a5=50;
        int total=a1+a2+a3+a4+a5;
        System.out.println(total); //150
        // 1.이동할때?, 변수명관리?, 데이터의수가 많아질때...
        // 구조=덩어리=객체(Object)
        int[] arr=new int[5]; // 배열생성->반복문(for, while)
        arr[0]=10; // 원소저장
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<arr.length;i++) { // i++ -> i=i+1
            System.out.println(arr[i]); // i->0,1,2,3,4<5(arr.length)
        }
        // 총합?
        //int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];// 누적
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i]; // sum+=arr[i];
        }
        int hap=0;
        for(int su  : arr ){ // 향상된 for문 - foreach
            hap=hap+su; //  hap+=su;
        }
        System.out.println(sum); //150
    }
}
