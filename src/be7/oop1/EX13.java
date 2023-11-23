package be7.oop1;
public class EX13 {
    public static void main(String[] args) {
        // 6. 빈도수 구하기(range : 1~5)
        int[] a={1,3,4,1,2,5,1,3,4,1}; // 10개
       /*
        1의 cnt : 4개:■■■■
        2의 cnt : 1개:■
        3의 cnt : 2개:■■
        4의 cnt : 2개:■■
        5의 cnt : 1개:■
        */
        int[] cnt=new int[5]; // 초기값을 모두 0
        for(int i=0;i<a.length;i++){
             cnt[a[i]-1]++; // 핵심
        }
        for(int i=0;i<cnt.length;i++){
            System.out.print((i+1)+"의 cnt : "+cnt[i]+"개:");
            for(int j=0;j<cnt[i];j++){
                System.out.print("■");
            }//
            System.out.println();
        }//
    }
}
