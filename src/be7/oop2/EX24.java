package be7.oop2;

import java.util.Scanner;

public class EX24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); // Scanner는 단독으로 사용이 불가하다.
        // 정수 여러개를 입력 받아서 출력하시오.(-1)을 입력하면 종료하세요.
        // for, while
        // 무한루프
       /* while(true){
            System.out.print("정수를 입력:");
            int data=scan.nextInt(); // blocking(블럭킹)
            if(data==-1) break;
            System.out.println(data);
          // break
        }*/
        int data;
        System.out.print("정수를 입력:");
        while((data=scan.nextInt())!=-1){
            System.out.println(data);
            System.out.print("정수를 입력:");
        }
        System.out.println("종료");
    }
}
