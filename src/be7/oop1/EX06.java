package be7.oop1;

public class EX06 {
    public static void main(String[] args) {
        // 별찍기(2중 for)
       for(int i=0;i<5;i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("★");
           }//
           System.out.println();
       }//
       for(int i=1;i<6;i++) {
          for (int j = 0; j < i; j++) { //i=1,2,3,4,5<6
              System.out.print("★");
          }//
          System.out.println();
       }//
    }
}
/*
 ★
 ★★
 ★★★
 ★★★★
 ★★★★★
 */