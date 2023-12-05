package be7.oop2;

import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {
        int[] arr; // new int[size];
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("크기(size)를 입력하세요 : ");
        size = scan.nextInt();
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 정수 : ");
            arr[i] = scan.nextInt();
        }

        for (int su : arr) {
            System.out.print(su + "\t");
        }
        System.out.println();

        // 정렬하여 출력하시오.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }//
            }//
        }//

        for (int su : arr) {
            System.out.print(su + "\t");
        }
    }
}
