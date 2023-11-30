package be7.oop2;

import be7.model.MyCalc;

import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        // MyCalc, java.lang.Math, Scanner(스케너)
        // 키보드로 부터 데이터를 입력받기
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력1:");
        int su1=scan.nextInt(); // 키보드로 부터 정수를 입력
        System.out.print("정수를 입력2:");
        int su2=scan.nextInt();
        //MyCalc calc=new MyCalc();
        System.out.println(MyCalc.add(su1, su2));
        System.out.println(MyCalc.sub(su1, su2));
        System.out.println(MyCalc.mul(su1, su2));
        System.out.println(MyCalc.div(su1, su2));
        // 1. private Scanner(){   }
        // 2. 디폴트 생성자가 없어서..

    }
}

