package be7.oop1;

public class EX05 {
    public static void main(String[] args) {
        // 가변길이 배열(메모리 데이터 베이스) ->논리적인 사고력(자료구조, 알고리즘)
        int[][] a=new int[5][];
        for(int i=0;i<5;i++){
            a[i]=new int[i+1];
        }
        //데이터를 저장 *
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]='★';
                System.out.print((char)a[i][j]);
            }//
            System.out.println();
        }//
    }//
}//
