package be7.oop1;

import javax.crypto.spec.PSource;

public class EX08 {
    public static void main(String[] args) {
        // 구구단
        for(int i=1;i<10;i++) {
            for (int j = 2; j < 10; j++) {
                if ((j * i) < 10) { // i=1,2,3,.... 9<10
                    System.out.print(j + "X" + i + "=0" + (j * i) + "\t");
                } else {
                    System.out.print(j + "X" + i + "=" + (j * i) + "\t");
                }
            }
            System.out.println();
        }
    }
}
/*
  2X1=02   3X1=03   4X1=04 ..............  9X1=09
  2X2=_4   3X2=06   4X2=08 ..............  9X2=18



  2X19=18   3X9=27   4X9=36 ..............  9X9=81
 */
