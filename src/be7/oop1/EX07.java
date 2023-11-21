package be7.oop1;

public class EX07 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--) {
            for (int j = 0; j < i; j++) { // i=5,4,3,2,1>0
                System.out.print("★");
            }//
            System.out.println();
        }//

        for(int i=4;i>=0;i--) {
          for (int j = 0; j < 5; j++) {
              if (j < i) { // i=4,3,2,1,0>-1
                  System.out.print(" ");
              } else {
                  System.out.print("*");
              }
          }//
          System.out.println();
        }//

        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i) { //0->1 ,2, 3 ,4
                    System.out.print("*");// j=0,1,2,3,4
                } else {
                    System.out.print(" "); // X
                }
            }//
            System.out.println();
        }//
    }
}
/*
  ____★
  ___★★
  __★★★
  _★★★★
 ★★★★★

 ★★★★★
  ★★★★
   ★★★
    ★★
     ★
 */