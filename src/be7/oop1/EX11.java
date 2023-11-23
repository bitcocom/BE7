package be7.oop1;

public class EX11 {
    public static void main(String[] args) {
        // 1. 1씩 증가하는 모든 표현
        int a=10;
        a++;
        a=a+1;
        a+=1;
        ++a;
        //++a++;
        System.out.println(a); // 14
        System.out.println(a++); // 14
        System.out.println(++a); // 16
        // 2. 누적
        // 1~100 =>5050
        int hap=0;
        for(int i=1;i<=100;i++){
               hap=hap+i; // 누적
        }
        System.out.println(hap);
        // 3. 카운트
        // 1~10까지의 수중 짝수의 수와 홀수의 수를 출력
        // 2+4+6+8+10=?
        // 1+3+5+7+9=?
        int evenCnt=0;
        int oddCnt=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                evenCnt++; //
            }else{
                oddCnt++;
            }//
        }//
        System.out.println("evenCnt = " + evenCnt); //5
        System.out.println("oddCnt = " + oddCnt);//5
        // 4. swap(메모리 교환)
        int x=10;
        int y=20;
        int tmp;
        tmp=x;
         x=y;
        y=tmp;
        System.out.println("x = " + x); // 20
        System.out.println("y = " + y); // 10
    }
}
