package be7.oop1;

public class EX04 {
    public static void main(String[] args) {
        // 자료형
        // 변수 -> 배열
        int a;
        a=10;
        int[] b=new int[5]; // 1차원 배열, 리스트구조
        // 2행X3열의 정수형 배열을 생성
        // 2차원배열, 테이블구조(행X열)
        int[][] c=new int[2][3];
        // 반복문(for2개)
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=10;
                System.out.print(c[i][j]+"\t"); // 10
            }
            System.out.println(); // 줄바꿈
        }

/*      Book d;
        Book[] e;
        Book[][] f;*/
    }
}
