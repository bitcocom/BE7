package be7.oop2;

import java.util.Scanner;

public class EX24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner는 단독으로 사용이 불가하다.
        // 정수 여러 개를 입력 받아서 출력하시오. (-1)을 입력하면 종료하시오.
        // for, while
        // 무한루프
        /*
        while (true) {
            System.out.print("정수를 입력 : ");
            int data = scan.nextInt(); // blocking (블럭킹) : 사용자가 입력할 때까지 멈춰 있다.
            if (data == -1) break;
            System.out.println(data);
        }
         */
        int data;
        System.out.print("정수를 입력 : ");
        while ((data = scan.nextInt()) != -1) {
            System.out.println(data);
            System.out.print("정수를 입력 : ");
        }
        System.out.println("종료");
    }
}
